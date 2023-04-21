package com.cakeets.android.app.launch.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.cakeets.android.R
import com.cakeets.android.app.AppScreens
import com.cakeets.android.app.launch.domain.model.Feature
import com.cakeets.android.app.launch.screens.components.ContentPage
import com.cakeets.android.app.launch.screens.components.Index
import com.cakeets.android.theme.PoppinsTypography
import com.google.accompanist.systemuicontroller.SystemUiController
import kotlinx.coroutines.launch

@Composable
fun OnBoarding(controller: NavHostController, ui: SystemUiController) {

    Setup(ui)

    Screen(controller)

}

@Composable
private fun Setup(ui: SystemUiController) {
    ui.setNavigationBarColor(
        color = MaterialTheme.colorScheme.surface,
        darkIcons = false
    )
    ui.setStatusBarColor(
        color = MaterialTheme.colorScheme.surface,
        darkIcons = false
    )
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
private fun Screen(controller: NavHostController) {

    Column(
        Modifier
            .fillMaxSize()
    ) {

        val index = Feature.get()
        val state = rememberPagerState()
        val coroutine = rememberCoroutineScope()

        Navbar(index.size, state.currentPage) {
            controller.popBackStack()
            controller.navigate(AppScreens.Access.route)
        }

        HorizontalPager(
            modifier = Modifier
                .fillMaxSize()
                .weight(0.8f),
            pageCount = index.size,
            state = state
        ) { page ->

            ContentPage(index[page])

        }

        IndexNavbar(
            size = index.size,
            currentPage = state.currentPage,
            onNextClicked = {
                if (state.currentPage + 1 < index.size)
                    coroutine.launch {
                        state.scrollToPage(state.currentPage + 1)
                    }
            },
            onComeOnClicked = {
                controller.popBackStack()
                controller.navigate(AppScreens.Access.route)
            }
        )

    }

}

@Composable
private fun Navbar(size: Int, currentPage: Int, onSkipClicked: () -> Unit) {

    Box(
        Modifier
            .fillMaxWidth()
            .padding(12.dp)
    ) {

        if (currentPage != size - 1)
            TextButton(
                modifier = Modifier
                    .align(Alignment.CenterEnd),
                onClick = onSkipClicked
            ) {

                Text(
                    stringResource(id = R.string.button_skip),
                    color = MaterialTheme.colorScheme.onBackground,
                    style = PoppinsTypography.labelLarge
                )

            }

    }

}

@Composable
private fun IndexNavbar(
    size: Int,
    currentPage: Int,
    onNextClicked: () -> Unit,
    onComeOnClicked: () -> Unit
) {

    Box(
        Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {

        Index(size, currentPage)

        if (currentPage == size - 1)
            Button(
                modifier = Modifier
                    .align(Alignment.CenterEnd),
                onClick = onComeOnClicked
            ) {

                Text(
                    text = stringResource(id = R.string.button_comeon),
                    style = PoppinsTypography.labelLarge
                )

            }
        else
            TextButton(
                modifier = Modifier
                    .align(Alignment.CenterEnd),
                onClick = onNextClicked
            ) {

                Text(
                    text = stringResource(id = R.string.button_next),
                    style = PoppinsTypography.labelLarge
                )

            }

    }

}