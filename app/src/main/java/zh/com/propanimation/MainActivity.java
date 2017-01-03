package zh.com.propanimation;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.os.Bundle;
import android.support.v4.view.animation.LinearOutSlowInInterpolator;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.img);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
//                animationView();
//                propertyValuesHolder();
//                valueAnimator();
//                paowuxian();
//                togetherRun();
//                playWithAfter();
                scaleX();
            }
        });
    }


    private void animationView () {
        ObjectAnimator anim = ObjectAnimator.ofFloat(imageView, "zh", 1.0f, 0.0f)
                .setDuration(1000);
        anim.start();
        anim.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate (ValueAnimator valueAnimator) {
                float cVal = (Float) valueAnimator.getAnimatedValue();
                imageView.setAlpha(cVal);
                imageView.setScaleX(cVal);
                imageView.setScaleY(cVal);
            }
        });
    }

    private void valueAnimator () {
        ValueAnimator valueAnimator = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(1000);
        valueAnimator.setTarget(imageView);
        valueAnimator.start();
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate (ValueAnimator animation) {
                float value = (Float) animation.getAnimatedValue();
                imageView.setAlpha(value);
            }
        });

    }

    private void propertyValuesHolder () {
        PropertyValuesHolder pvhP = PropertyValuesHolder.ofFloat("alpha", 1f, 0f, 1f);
        PropertyValuesHolder pvhX = PropertyValuesHolder.ofFloat("scaleX", 1f, 0f, 1f);
        PropertyValuesHolder pvhY = PropertyValuesHolder.ofFloat("scaleY", 1f, 0f, 1f);
        ObjectAnimator animator = ObjectAnimator.ofPropertyValuesHolder(imageView, pvhP, pvhX, pvhY).setDuration(1000);
        animator.setInterpolator(new LinearOutSlowInInterpolator());
        animator.start();
    }

    private void paowuxian () {
        ValueAnimator animator = new ValueAnimator();
        animator.setDuration(3000);
        animator.setObjectValues(new PointF(0, 0));
        animator.setInterpolator(new LinearInterpolator());
        animator.setEvaluator(new TypeEvaluator<PointF>() {
            @Override
            public PointF evaluate (float fraction, PointF startValue, PointF endValue) {
                PointF pointF = new PointF();
                pointF.x = 200 * fraction * 3;
                pointF.y = 0.5f * 200 * (fraction * 3) * (fraction * 3);
                return pointF;
            }
        });

        animator.start();
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate (ValueAnimator animation) {
                PointF pointF = (PointF) animation.getAnimatedValue();
                imageView.setX(pointF.x);
                imageView.setY(pointF.y);
            }
        });
    }

    private void togetherRun () {
        ObjectAnimator animator1 = ObjectAnimator.ofFloat(imageView, "scaleX", 1.0f, 2f);
        ObjectAnimator animator2 = ObjectAnimator.ofFloat(imageView, "scaleX", 1.0f, 2f);
        AnimatorSet set = new AnimatorSet();
        set.setDuration(2000);
        set.setInterpolator(new LinearInterpolator());
        set.playTogether(animator1, animator2);
        set.start();
    }

    private void playWithAfter () {
        float cx = imageView.getX();
        ObjectAnimator anim1 = ObjectAnimator.ofFloat(imageView, "scaleX",
                1.0f, 2f);
        ObjectAnimator anim2 = ObjectAnimator.ofFloat(imageView, "scaleY",
                1.0f, 2f);
        ObjectAnimator anim3 = ObjectAnimator.ofFloat(imageView, "x", cx, 0f);
        ObjectAnimator anim4 = ObjectAnimator.ofFloat(imageView, "x", cx);
        AnimatorSet set = new AnimatorSet();
        set.setDuration(1000);
        set.play(anim1).with(anim2);
        set.play(anim2).with(anim3);
        set.play(anim4).after(anim3);
        set.start();

    }

    private void scaleX () {
        Animator animator = AnimatorInflater.loadAnimator(this, R.animator.scalex);
        animator.setTarget(imageView);
        animator.start();
    }

    private void transition(){
        LayoutTransition transition = new LayoutTransition();
        transition.setAnimator(LayoutTransition.APPEARING,transition.getAnimator(LayoutTransition.APPEARING));
    }

}
