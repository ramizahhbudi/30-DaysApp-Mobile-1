package trpl.nim234311049.inspirasijajan30.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

class Kue(
    @StringRes val nameRes: Int, // Resource ID untuk nama kue
    @StringRes val descriptionRes: Int, // Resource ID untuk deskripsi kue
    @DrawableRes val imageRes: Int, // Resource ID untuk gambar kue
)
