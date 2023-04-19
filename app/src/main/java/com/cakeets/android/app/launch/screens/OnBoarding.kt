package com.cakeets.android.app.launch.screens

import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.spring
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.KeyboardArrowLeft
import androidx.compose.material.icons.outlined.KeyboardArrowRight
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.accompanist.systemuicontroller.SystemUiController
import kotlinx.coroutines.launch

@Composable
fun OnBoarding(iuController: SystemUiController) {
    iuController.setNavigationBarColor(
        color = MaterialTheme.colorScheme.surface,
        darkIcons = false
    )
    iuController.setStatusBarColor(
        color = MaterialTheme.colorScheme.surface,
        darkIcons = false
    )
    OnBoardingScreen()
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
@Preview
fun OnBoardingScreen() {

    val scope= rememberCoroutineScope()

    Column(Modifier.fillMaxSize()) {
        TopSection()

        val items=OnBoardingItem.get()
        val state= rememberPagerState()

        HorizontalPager(
            state = state,
            modifier= Modifier
                .fillMaxSize()
                .weight(0.8f),
            pageCount = items.size
        ) {page->

            OnBoardingItem(items[page])

        }

        BottomSection(size = items.size, index = state.currentPage) {
            if (state.currentPage+1 <items.size)
                scope.launch {
                    state.scrollToPage(state.currentPage+1)
                }
        }

    }

}

@Composable
@Preview
fun TopSection() {
    Box(
        modifier= Modifier
            .fillMaxWidth()
            .padding(12.dp)
    ){

        //back button
        IconButton(
            onClick = { },
            modifier= Modifier.align(Alignment.CenterStart)
        ) {
            Icon(Icons.Outlined.KeyboardArrowLeft,null)
        }

        //skip button
        TextButton(
            onClick = {},
            modifier= Modifier.align(Alignment.CenterEnd)
        ) {
            Text("Skip",color= MaterialTheme.colorScheme.onBackground)
        }

    }
}

@Composable
fun BottomSection(
    size: Int,
    index: Int,
    onNextClicked:()->Unit
) {
    Box(
        modifier= Modifier
            .fillMaxWidth()
            .padding(12.dp)
    ){

        //indicators
        Indicators(size = size, index = index)

        //next button
        FloatingActionButton(
            onClick =onNextClicked,
            modifier= Modifier.align(Alignment.CenterEnd),
            contentColor = MaterialTheme.colorScheme.onPrimary
        ) {
            Icon(Icons.Outlined.KeyboardArrowRight,null)
        }

    }
}

@Composable
fun BoxScope.Indicators(size:Int, index:Int){
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(12.dp),
        modifier = Modifier.align(Alignment.CenterStart)
    ) {
        repeat(size){
            Indicator(isSelected = it == index)
        }
    }
}


@Composable
fun Indicator(isSelected:Boolean){
    val width= animateDpAsState(
        targetValue = if (isSelected) 25.dp else 10.dp,
        animationSpec = spring(dampingRatio = Spring.DampingRatioMediumBouncy)
    )

    Box(
        modifier = Modifier
            .height(10.dp)
            .width(width.value)
            .clip(CircleShape)
            .background(
                if (isSelected) MaterialTheme.colorScheme.primary
                else MaterialTheme.colorScheme.onBackground.copy(alpha = 0.5f)
            )
    ){

    }
}

@Composable
fun OnBoardingItem(
    item:OnBoardingItem
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Image(painter = painterResource(item.image), contentDescription = null)

        Text(
            text = stringResource(item.title),
            fontSize = 24.sp,
            color= MaterialTheme.colorScheme.onBackground,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = stringResource(item.body),
            color= MaterialTheme.colorScheme.onBackground.copy(alpha=0.8f),
            textAlign= TextAlign.Center
        )
    }
}