package com.hosseiniseyro.apprating.ratingbar

import android.content.Context
import android.graphics.BlendMode
import android.graphics.BlendModeColorFilter
import android.graphics.PorterDuff
import android.graphics.drawable.Drawable
import android.os.Build
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import androidx.annotation.ColorInt
import androidx.annotation.NonNull
import com.hosseiniseyro.apprating.ALPHA_INVISIBLE
import com.hosseiniseyro.apprating.ALPHA_VISIBLE
import com.hosseiniseyro.apprating.CHECK_STAR_DURATION
import com.hosseiniseyro.apprating.R
import kotlinx.android.synthetic.main.star_button_layout.view.*


/**
 * @author Piotr Głębocki (Piotr.Glebocki@stepstone.com) on 12/04/2017.
 */
class StarButton : FrameLayout {

    constructor(context: Context) : super(context) {
        initialize()
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)

    private fun initialize() {
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        inflater.inflate(R.layout.star_button_layout, this, true)
    }

    fun setChecked(checked: Boolean): StarButton {
        fullStarImage
                .animate()
                .alpha(if (checked) ALPHA_VISIBLE else ALPHA_INVISIBLE)
                .setDuration(CHECK_STAR_DURATION)
                .start()

        return this
    }

    fun setCheckedWithoutAnimation(checked: Boolean): StarButton {
        fullStarImage.alpha = if (checked) ALPHA_VISIBLE else ALPHA_INVISIBLE
        return this
    }

    fun setColor(@ColorInt color: Int): StarButton {

        emptyStarImage.setColorFilter(color)
        fullStarImage.setColorFilter(color)

        return this
    }
}
