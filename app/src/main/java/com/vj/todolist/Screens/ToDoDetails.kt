package com.vj.todolist.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun TodoDetails(
    modifier: Modifier = Modifier,
    onArchiveClick: () -> Unit,
    onDeleteClick: () -> Unit,
    onCompleteClick: () -> Unit
) {

    Box(
        contentAlignment = Alignment.Center,

        modifier = modifier
            .fillMaxSize(1f)
            .background(
                Brush.linearGradient(
                    colors = listOf(
                        Color(0xFF000000),
                        Color(0xFFE3E3E3)

                    )
                )
            )
    ) {
        Card(
            elevation = CardDefaults.cardElevation(4.dp),
            modifier = Modifier.padding(20.dp)

        ) {
            Column(modifier = Modifier.padding(8.dp)) {
                Text(
                    text = "Todo Title",
                    style = MaterialTheme.typography.headlineLarge,
                    modifier = Modifier.padding(8.dp)
                )
                Box(
                    modifier =
                    Modifier
                        .background(Color(0xFFEEEEEE))
                        .fillMaxWidth(.5f)
                        .height(1.dp)
                )

                Text(
                    text = "Todo Description: todolist using firebase and compose in android kotlin",
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier.padding(8.dp)
                )
                Box(
                    modifier =
                    Modifier
                        .background(Color(0xFF000000))
                        .fillMaxWidth(1f)
                        .height(2.dp)
                        .padding(0.dp, 8.dp)
                )
                Row(
                    modifier = Modifier
                        .padding(8.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    ArchiveButton(onArchiveClick = onArchiveClick)
                    Spacer(modifier = Modifier.width(16.dp))
                    DeleteButton(onDeleteClick = onDeleteClick)
                    Spacer(modifier = Modifier.width(16.dp))
                    CompleteButton(
                        onCompleteClick = onCompleteClick,
                        color = Color.Green, completed = true
                    )

                }


            }
        }

    }


}