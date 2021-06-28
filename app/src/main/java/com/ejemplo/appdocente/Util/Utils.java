package com.ejemplo.appdocente.Util;

import android.annotation.SuppressLint;

import com.ejemplo.appdocente.R;
import com.ejemplo.appdocente.TransformersUtil.AntiClockSpinTransformation;
import com.ejemplo.appdocente.TransformersUtil.ClockSpinTransformation;
import com.ejemplo.appdocente.TransformersUtil.CubeInDepthTransformation;
import com.ejemplo.appdocente.TransformersUtil.CubeInRotationTransformation;
import com.ejemplo.appdocente.TransformersUtil.CubeOutDepthTransformation;
import com.ejemplo.appdocente.TransformersUtil.CubeOutRotationTransformation;
import com.ejemplo.appdocente.TransformersUtil.CubeOutScalingTransformation;
import com.ejemplo.appdocente.TransformersUtil.DepthPageTransformer;
import com.ejemplo.appdocente.TransformersUtil.DepthTransformation;
import com.ejemplo.appdocente.TransformersUtil.FadeOutTransformation;
import com.ejemplo.appdocente.TransformersUtil.FanTransformation;
import com.ejemplo.appdocente.TransformersUtil.GateTransformation;
import com.ejemplo.appdocente.TransformersUtil.HingeTransformation;
import com.ejemplo.appdocente.TransformersUtil.HorizontalFlipTransformation;
import com.ejemplo.appdocente.TransformersUtil.PopTransformation;
import com.ejemplo.appdocente.TransformersUtil.SimpleTransformation;
import com.ejemplo.appdocente.TransformersUtil.SpinnerTransformation;
import com.ejemplo.appdocente.TransformersUtil.TossTransformation;
import com.ejemplo.appdocente.TransformersUtil.VerticalFlipTransformation;
import com.ejemplo.appdocente.TransformersUtil.VerticalShutTransformation;
import com.ejemplo.appdocente.TransformersUtil.ZoomOutPageTransformer;

import androidx.viewpager2.widget.ViewPager2;

public class Utils {
    @SuppressLint("NewApi")
    public static ViewPager2.PageTransformer getTransformer(int id) {
        switch (id) {
            case R.id.action_anti_clock_spin:
                return new AntiClockSpinTransformation();
            case R.id.action_clock_spin:
                return new ClockSpinTransformation();
            case R.id.action_cube_in_depth:
                return new CubeInDepthTransformation();
            case R.id.action_cube_in_rotate:
                return new CubeInRotationTransformation();
            case R.id.action_cube_out_depth:
                return new CubeOutDepthTransformation();
            case R.id.action_cube_out_rotate:
                return new CubeOutRotationTransformation();
            case R.id.action_cube_out_scaling:
                return new CubeOutScalingTransformation();
            case R.id.action_depth_page:
                return new DepthPageTransformer();
            case R.id.action_depth:
                return new DepthTransformation();
            case R.id.action_fade_out:
                return new FadeOutTransformation();
            case R.id.action_fan:
                return new FanTransformation();
            case R.id.action_gate:
                return new GateTransformation();
            case R.id.action_hinge:
                return new HingeTransformation();
            case R.id.action_horizontal_flip:
                return new VerticalFlipTransformation();
            case R.id.action_pop:
                return new PopTransformation();
            case R.id.action_simple_transformation:
                return new SimpleTransformation();
            case R.id.action_spinner:
                return new SpinnerTransformation();
            case R.id.action_toss:
                return new TossTransformation();
            case R.id.action_vertical_flip:
                return new HorizontalFlipTransformation();
            case R.id.action_vertical_shut:
                return new VerticalShutTransformation();
            case R.id.action_zoom_out:
                return new ZoomOutPageTransformer();
        }

        return null;
    }
}
