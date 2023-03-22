/**
 * The horizontally scrollable table with header and content.
 * @param columnCount the count of columns in the table
 * @param cellWidth the width of column, can be configured based on index of the column.
 * @param data the data to populate table.
 * @param modifier the modifier to apply to this layout node.
 * @param headerCellContent a block which describes the header cell content.
 * @param cellContent a block which describes the cell content.
 */
/*@Composable
fun <T> Table(
    columnCount: Int,
    cellWidth: (index: Int) -> Dp,
    data: List<T>,
    modifier: Modifier = Modifier,
    headerCellContent: @Composable (index: Int) -> Unit,
    cellContent: @Composable (index: Int, item: T) -> Unit,
) {
    Surface(
        modifier = modifier
    ) {
        LazyRow(
            modifier = Modifier.padding(16.dp)
        ) {
            items((0 until columnCount).toList()) { columnIndex ->
                Column {
                    (0..data.size).forEach { index ->
                        Surface(
                            border = BorderStroke(1.dp, Color.LightGray),
                            contentColor = Color.Transparent,
                            modifier = Modifier.width(cellWidth(columnIndex))
                        ) {
                            if (index == 0) {
                                headerCellContent(columnIndex)
                            } else {
                                cellContent(columnIndex, data[index - 1])
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Demo_Table() {
    val people = listOf(
        Person("Alex", 21, false, "alex@demo-email.com"),
        Person("Adam", 35, true, "adam@demo-email.com"),
        Person("Iris", 26, false, "iris@demo-email.com"),
        Person("Maria", 32, false, "maria@demo-email.com")
    )

    val cellWidth: (Int) -> Dp = { index ->
        when (index) {
            2 -> 250.dp
            3 -> 350.dp
            else -> 150.dp
        }
    }
    val headerCellTitle: @Composable (Int) -> Unit = { index ->
        val value = when (index) {
            0 -> "Name"
            1 -> "Age"
            2 -> "Has driving license"
            3 -> "Email"
            else -> ""
        }

        Text(
            text = value,
            fontSize = 20.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(16.dp),
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            fontWeight = FontWeight.Black,
            textDecoration = TextDecoration.Underline
        )
    }
    val cellText: @Composable (Int, Person) -> Unit = { index, item ->
        val value = when (index) {
            0 -> item.name
            1 -> item.age.toString()
            2 -> if (item.hasDrivingLicence) "YES" else "NO"
            3 -> item.email
            else -> ""
        }

        Text(
            text = value,
            fontSize = 20.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(16.dp),
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
        )
    }

    Table(
        columnCount = 4,
        cellWidth = cellWidth,
        data = people,
        modifier = Modifier.verticalScroll(rememberScrollState()),
        headerCellContent = headerCellTitle,
        cellContent = cellText
    )
}*/