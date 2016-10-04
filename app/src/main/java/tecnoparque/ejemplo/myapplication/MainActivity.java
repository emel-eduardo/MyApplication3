package tecnoparque.ejemplo.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.daimajia.slider.library.Animations.DescriptionAnimation;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    private SliderLayout mDemoSlider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* mDemoSlider = (SliderLayout) findViewById(R.id.slider);
        HashMap<String, Integer> url_maps = new HashMap<String, Integer>();

        url_maps.put("Tecnoparque nodo Valledupar", R.drawable.imagen1);
        url_maps.put("Colegio Fisher Kids", R.drawable.imagen2);


        for (String name : url_maps.keySet()) {
            TextSliderView textSliderView = new TextSliderView(getApplicationContext());//
            // initialize a SliderLayout
            textSliderView
                    .description(name)
                    //.image(url_maps.get(name))
                    .image(url_maps.get(name))
                    .setScaleType(BaseSliderView.ScaleType.Fit);

            //add your extra information
            textSliderView.bundle(new Bundle());
            textSliderView.getBundle()
                    .putString("extra", name);

            mDemoSlider.addSlider(textSliderView);
        }
        mDemoSlider.setPresetTransformer(SliderLayout.Transformer.Default);
        mDemoSlider.setPresetIndicator(SliderLayout.PresetIndicators.Right_Bottom);
        mDemoSlider.setCustomAnimation(new DescriptionAnimation());
        mDemoSlider.setDuration(4000);*/




        ImageButton button1 = (ImageButton) findViewById(R.id.fb);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/Monumentos-Valledupar-1268416656524699/?fref=ts"));
                startActivity(intent1);
            }
        });

        ImageButton button2 = (ImageButton) findViewById(R.id.in);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/monumentosvalledupar/"));
                startActivity(intent2);
            }
        });

        ImageButton button3 = (ImageButton) findViewById(R.id.tw);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/MonumentosValle"));
                startActivity(intent3);
            }
        });



    }
}
