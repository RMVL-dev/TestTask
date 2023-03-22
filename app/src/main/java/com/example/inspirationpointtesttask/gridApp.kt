package com.example.inspirationpointtesttask
/*
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun GridApp(){

    var offset by remember { mutableStateOf(0f) }

    /*Row (modifier = Modifier.scrollable(
        orientation = Orientation.Horizontal,
        state = rememberScrollableState { delta ->
            offset += delta
            delta
        }))*/
    val size = 50
    LazyRow()
    {
        item {
            ParticipantColumn(size = size)
            Spacer(modifier = Modifier.width(5.dp))
            ParticipantNumberColumn(size = size)
            FirstParticipantColumn(
                secondParticipantPoint = 1,
                thirdParticipantPoint = 2,
                fourthParticipantPoint = 3,
                fifthParticipantPoint = 4,
                sixthParticipantPoint = 5,
                seventhParticipantPoint = 6,
                size = size
            )
            SecondParticipantColumn(
                secondParticipantPoint = 3,
                thirdParticipantPoint = 4,
                fourthParticipantPoint = 5,
                fifthParticipantPoint = 2,
                sixthParticipantPoint = 3,
                seventhParticipantPoint = 4,
                size = size
            )
            ThirdParticipantColumn(
                secondParticipantPoint = 2,
                thirdParticipantPoint = 3,
                fourthParticipantPoint = 4,
                fifthParticipantPoint = 5,
                sixthParticipantPoint = 3,
                seventhParticipantPoint = 2,
                size = size
            )
            FourthParticipantColumn(
                secondParticipantPoint = 4,
                thirdParticipantPoint = 2,
                fourthParticipantPoint = 3,
                fifthParticipantPoint = 4,
                sixthParticipantPoint = 5,
                seventhParticipantPoint = 5,
                size = size
            )
            FifthParticipantColumn(
                secondParticipantPoint = 3,
                thirdParticipantPoint = 4,
                fourthParticipantPoint = 5,
                fifthParticipantPoint = 3,
                sixthParticipantPoint = 4,
                seventhParticipantPoint = 2,
                size = size
            )
            SixthParticipantColumn(
                secondParticipantPoint = 4,
                thirdParticipantPoint = 5,
                fourthParticipantPoint = 2,
                fifthParticipantPoint = 3,
                sixthParticipantPoint = 5,
                seventhParticipantPoint = 5,
                size = size
            )
            SeventhParticipantColumn(
                secondParticipantPoint = 5,
                thirdParticipantPoint = 4,
                fourthParticipantPoint = 2,
                fifthParticipantPoint = 3,
                sixthParticipantPoint = 4,
                seventhParticipantPoint = 5,
                size = size
            )
        }
    }

}

@Composable
fun ParticipantColumn(
    modifier: Modifier = Modifier,
    size:Int
){

    LazyColumn() {
        item {
            Text(
                text = "",
                modifier = Modifier.height(size.dp)
            ) // empty cell
            Text(
                text = stringResource(id = R.string.participant_1),
                modifier = Modifier.height(size.dp)
            )
            Text(
                text = stringResource(id = R.string.participant_2),
                modifier = Modifier.height(size.dp)
            )
            Text(
                text = stringResource(id = R.string.participant_3),
                modifier = Modifier.height(size.dp)
            )
            Text(
                text = stringResource(id = R.string.participant_4),
                modifier = Modifier.height(size.dp)
            )
            Text(
                text = stringResource(id = R.string.participant_5),
                modifier = Modifier.height(size.dp)
            )
            Text(
                text = stringResource(id = R.string.participant_6),
                modifier = Modifier.height(size.dp)
            )
            Text(
                text = stringResource(id = R.string.participant_7),
                modifier = Modifier.height(size.dp)
            )
        }
    }

}
@Composable
fun ParticipantNumberColumn(
    modifier: Modifier = Modifier,
    size:Int
){
    LazyColumn {
        item {
            Text(
                text = "",
                modifier = Modifier.height(size.dp)
            ) // empty cell
            Text(
                text = stringResource(id = R.string.number_1),
                modifier = Modifier.height(size.dp)
            )
            Text(
                text = stringResource(id = R.string.number_2),
                modifier = Modifier.height(size.dp)
            )
            Text(
                text = stringResource(id = R.string.number_3),
                modifier = Modifier.height(size.dp)
            )
            Text(
                text = stringResource(id = R.string.number_4),
                modifier = Modifier.height(size.dp)
            )
            Text(
                text = stringResource(id = R.string.number_5),
                modifier = Modifier.height(size.dp)
            )
            Text(
                text = stringResource(id = R.string.number_6),
                modifier = Modifier.height(size.dp)
            )
            Text(
                text = stringResource(id = R.string.number_7),
                modifier = Modifier.height(size.dp)
            )
        }
    }
}
@Composable
fun FirstParticipantColumn(
    modifier: Modifier = Modifier,
    secondParticipantPoint: Int,
    thirdParticipantPoint: Int,
    fourthParticipantPoint: Int,
    fifthParticipantPoint: Int,
    sixthParticipantPoint: Int,
    seventhParticipantPoint: Int,
    size:Int
){
    LazyColumn(modifier = modifier.width(size.dp)) {
        item {
            Text(
                text = stringResource(id = R.string.number_1),
                modifier = Modifier.height(size.dp)
            )
            Box(
                modifier = Modifier
                    .height(size.dp)
                    .background(color = Color.Black)
            )
            OutlinedTextField(
                value = secondParticipantPoint.toString(),
                onValueChange = {},
                modifier = Modifier.height(size.dp)
            )
            OutlinedTextField(
                value = thirdParticipantPoint.toString(),
                onValueChange = {},
                modifier = Modifier.height(size.dp)
            )
            OutlinedTextField(
                value = fourthParticipantPoint.toString(),
                onValueChange = {},
                modifier = Modifier.height(size.dp)
            )
            OutlinedTextField(
                value = fifthParticipantPoint.toString(),
                onValueChange = {},
                modifier = Modifier.height(size.dp)
            )
            OutlinedTextField(
                value = sixthParticipantPoint.toString(),
                onValueChange = {},
                modifier = Modifier.height(size.dp)
            )
            OutlinedTextField(
                value = seventhParticipantPoint.toString(),
                onValueChange = {},
                modifier = Modifier.height(size.dp)
            )
        }
    }
}
@Composable
fun SecondParticipantColumn(
    modifier: Modifier = Modifier,
    secondParticipantPoint: Int,
    thirdParticipantPoint: Int,
    fourthParticipantPoint: Int,
    fifthParticipantPoint: Int,
    sixthParticipantPoint: Int,
    seventhParticipantPoint: Int,
    size: Int
){
    LazyColumn(modifier = modifier.width(size.dp)) {
        item {
            Text(
                text = stringResource(id = R.string.number_2),
                modifier = Modifier.height(size.dp)
            )
            OutlinedTextField(
                value = secondParticipantPoint.toString(),
                onValueChange = {},
                modifier = Modifier.height(size.dp)
            )
            Box(
                modifier = Modifier
                    .height(size.dp)
                    .background(color = Color.Black)
            )
            OutlinedTextField(
                value = thirdParticipantPoint.toString(),
                onValueChange = {},
                modifier = Modifier.height(size.dp)
            )
            OutlinedTextField(
                value = fourthParticipantPoint.toString(),
                onValueChange = {},
                modifier = Modifier.height(size.dp)
            )
            OutlinedTextField(
                value = fifthParticipantPoint.toString(),
                onValueChange = {},
                modifier = Modifier.height(size.dp)
            )
            OutlinedTextField(
                value = sixthParticipantPoint.toString(),
                onValueChange = {},
                modifier = Modifier.height(size.dp)
            )
            OutlinedTextField(
                value = seventhParticipantPoint.toString(),
                onValueChange = {},
                modifier = Modifier.height(size.dp)
            )
        }
    }
}
@Composable
fun ThirdParticipantColumn(
    modifier: Modifier = Modifier,
    secondParticipantPoint: Int,
    thirdParticipantPoint: Int,
    fourthParticipantPoint: Int,
    fifthParticipantPoint: Int,
    sixthParticipantPoint: Int,
    seventhParticipantPoint: Int,
    size: Int
){
    LazyColumn(modifier = modifier.width(size.dp)) {
        item {
            Text(
                text = stringResource(id = R.string.number_3),
                modifier = Modifier.height(size.dp)
            )

            OutlinedTextField(
                value = secondParticipantPoint.toString(),
                onValueChange = {},
                modifier = Modifier.height(size.dp)
            )
            OutlinedTextField(
                value = thirdParticipantPoint.toString(),
                onValueChange = {},
                modifier = Modifier.height(size.dp)
            )
            Box(
                modifier = Modifier
                    .height(size.dp)
                    .background(color = Color.Black)
            )
            OutlinedTextField(
                value = fourthParticipantPoint.toString(),
                onValueChange = {},
                modifier = Modifier.height(size.dp)
            )
            OutlinedTextField(
                value = fifthParticipantPoint.toString(),
                onValueChange = {},
                modifier = Modifier.height(size.dp)
            )
            OutlinedTextField(
                value = sixthParticipantPoint.toString(),
                onValueChange = {},
                modifier = Modifier.height(size.dp)
            )
            OutlinedTextField(
                value = seventhParticipantPoint.toString(),
                onValueChange = {},
                modifier = Modifier.height(size.dp)
            )
        }
    }
}
@Composable
fun FourthParticipantColumn(
    modifier: Modifier = Modifier,
    secondParticipantPoint: Int,
    thirdParticipantPoint: Int,
    fourthParticipantPoint: Int,
    fifthParticipantPoint: Int,
    sixthParticipantPoint: Int,
    seventhParticipantPoint: Int,
    size: Int
){
    LazyColumn(modifier = modifier.width(size.dp)) {
        item {
            Text(
                text = stringResource(id = R.string.number_4),
                modifier = Modifier.height(size.dp)
            )
            OutlinedTextField(
                value = secondParticipantPoint.toString(),
                onValueChange = {},
                modifier = Modifier.height(size.dp)
            )
            OutlinedTextField(
                value = thirdParticipantPoint.toString(),
                onValueChange = {},
                modifier = Modifier.height(size.dp)
            )
            OutlinedTextField(
                value = fourthParticipantPoint.toString(),
                onValueChange = {},
                modifier = Modifier.height(size.dp)
            )
            Box(
                modifier = Modifier
                    .height(size.dp)
                    .background(color = Color.Black)
            )
            OutlinedTextField(
                value = fifthParticipantPoint.toString(),
                onValueChange = {},
                modifier = Modifier.height(size.dp)
            )
            OutlinedTextField(
                value = sixthParticipantPoint.toString(),
                onValueChange = {},
                modifier = Modifier.height(size.dp)
            )
            OutlinedTextField(
                value = seventhParticipantPoint.toString(),
                onValueChange = {},
                modifier = Modifier.height(size.dp)
            )
        }
    }
}
@Composable
fun FifthParticipantColumn(
    modifier: Modifier = Modifier,
    secondParticipantPoint: Int,
    thirdParticipantPoint: Int,
    fourthParticipantPoint: Int,
    fifthParticipantPoint: Int,
    sixthParticipantPoint: Int,
    seventhParticipantPoint: Int,
    size: Int
){
    LazyColumn(modifier = modifier.width(size.dp)) {
        item {
            Text(
                text = stringResource(id = R.string.number_5),
                modifier = Modifier.height(size.dp)
            )
            OutlinedTextField(
                value = secondParticipantPoint.toString(),
                onValueChange = {},
                modifier = Modifier.height(size.dp)
            )
            OutlinedTextField(
                value = thirdParticipantPoint.toString(),
                onValueChange = {},
                modifier = Modifier.height(size.dp)
            )
            OutlinedTextField(
                value = fourthParticipantPoint.toString(),
                onValueChange = {},
                modifier = Modifier.height(size.dp)
            )

            OutlinedTextField(
                value = fifthParticipantPoint.toString(),
                onValueChange = {},
                modifier = Modifier.height(size.dp)
            )
            Box(
                modifier = Modifier
                    .height(size.dp)
                    .background(color = Color.Black)
            )
            OutlinedTextField(
                value = sixthParticipantPoint.toString(),
                onValueChange = {},
                modifier = Modifier.height(size.dp)
            )
            OutlinedTextField(
                value = seventhParticipantPoint.toString(),
                onValueChange = {},
                modifier = Modifier.height(size.dp)
            )
        }
    }
}
@Composable
fun SixthParticipantColumn(
    modifier: Modifier = Modifier,
    secondParticipantPoint: Int,
    thirdParticipantPoint: Int,
    fourthParticipantPoint: Int,
    fifthParticipantPoint: Int,
    sixthParticipantPoint: Int,
    seventhParticipantPoint: Int,
    size: Int
){
    LazyColumn(modifier = modifier.width(size.dp)) {
        item {
            Text(
                text = stringResource(id = R.string.number_6),
                modifier = Modifier.height(size.dp)
            )
            OutlinedTextField(
                value = secondParticipantPoint.toString(),
                onValueChange = {},
                modifier = Modifier.height(size.dp)
            )
            OutlinedTextField(
                value = thirdParticipantPoint.toString(),
                onValueChange = {},
                modifier = Modifier.height(size.dp)
            )
            OutlinedTextField(
                value = fourthParticipantPoint.toString(),
                onValueChange = {},
                modifier = Modifier.height(size.dp)
            )

            OutlinedTextField(
                value = fifthParticipantPoint.toString(),
                onValueChange = {},
                modifier = Modifier.height(size.dp)
            )
            OutlinedTextField(
                value = sixthParticipantPoint.toString(),
                onValueChange = {},
                modifier = Modifier.height(size.dp)
            )
            Box(
                modifier = Modifier
                    .height(size.dp)
                    .background(color = Color.Black)
            )
            OutlinedTextField(
                value = seventhParticipantPoint.toString(),
                onValueChange = {},
                modifier = Modifier.height(size.dp)
            )
        }
    }
}
@Composable
fun SeventhParticipantColumn(
    modifier: Modifier = Modifier,
    secondParticipantPoint: Int,
    thirdParticipantPoint: Int,
    fourthParticipantPoint: Int,
    fifthParticipantPoint: Int,
    sixthParticipantPoint: Int,
    seventhParticipantPoint: Int,
    size: Int
){
    LazyColumn(modifier = modifier.width(size.dp)) {
        item {
            Text(
                text = stringResource(id = R.string.number_7),
                modifier = Modifier.height(size.dp)
            )
            OutlinedTextField(
                value = secondParticipantPoint.toString(),
                onValueChange = {},
                modifier = Modifier.height(size.dp)
            )
            OutlinedTextField(
                value = thirdParticipantPoint.toString(),
                onValueChange = {},
                modifier = Modifier.height(size.dp)
            )
            OutlinedTextField(
                value = fourthParticipantPoint.toString(),
                onValueChange = {},
                modifier = Modifier.height(size.dp)
            )

            OutlinedTextField(
                value = fifthParticipantPoint.toString(),
                onValueChange = {},
                modifier = Modifier.height(size.dp)
            )
            OutlinedTextField(
                value = sixthParticipantPoint.toString(),
                onValueChange = {},
                modifier = Modifier.height(size.dp)
            )
            OutlinedTextField(
                value = seventhParticipantPoint.toString(),
                onValueChange = {},
                modifier = Modifier.height(size.dp)
            )
            Box(
                modifier = Modifier
                    .height(size.dp)
                    .background(color = Color.Black)
            )
        }
    }
}

@Composable
@Preview (showBackground = true)
fun PreviewApp() {
GridApp()
}*/