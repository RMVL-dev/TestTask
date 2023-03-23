package com.example.inspirationpointtesttask

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.inspirationpointtesttask.ParticipantData.participantList

@Composable
fun Table(
    countOfColumns: Int,
    cellWidth:Int
){
    LazyRow(modifier = Modifier){
        items ((0 until countOfColumns).toList())
        { columnIndex ->
            Column {
                (0..7).forEach { index ->
                    Surface(
                        border = BorderStroke(1.dp, Color.Black),
                        modifier = Modifier.width(cellWidth.dp)
                    ) {
                        if (columnIndex == 0 || columnIndex == 1){
                            Text(text = "")
                        }
                        if (index>0 && columnIndex == 0){
                            Text(text = stringResource(id = participantList[index - 1].name))
                        }
                        if (index>0 && columnIndex == 1){
                            Text(
                                    text = stringResource(id = participantList[index - 1].number),
                                    textAlign = TextAlign.Center
                            )
                        }
                        if (columnIndex>1){
                            if (index==0){
                                NeededText(text = participantList[columnIndex - 2].number)
                            }
                            NeededTextField(
                                    point = 1,
                                    onValueChange = {},
                                    size = 19
                            )
                        }
                    }
                }

            }
        }
    }

}

@Composable
fun NeededText(
    text:Int
){
    Text(text = stringResource(id = text))
}

@Composable
fun NeededTextField(
    point:Int,
    onValueChange:(String) -> Unit,
    size:Int
){
    OutlinedTextField(
        value = point.toString(),
        onValueChange = onValueChange,
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number).copy(
            imeAction = ImeAction.Done
        ),
        modifier = Modifier.height(size.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewTable(){
    Table(countOfColumns = 9, cellWidth = 75)
}