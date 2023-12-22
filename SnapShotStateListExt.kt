import androidx.compose.runtime.snapshots.SnapshotStateList

fun <T> SnapshotStateList<T>.forEachIndexed(iterator: (index: Int, item: T) -> Unit) {
    for (i in indices) {
        iterator.invoke(i, get(i))
    }
}
