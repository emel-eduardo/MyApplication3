package tecnoparque.ejemplo.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.daimajia.slider.library.Animations.DescriptionAnimation;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;

import java.util.HashMap;

public class AcercadeFragment extends Fragment {

    public AcercadeFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_acercade, container, false);

        // SLIDER

        SliderLayout mDemoSlider = (SliderLayout) view.findViewById(R.id.slider);
        HashMap<String, Integer> url_maps = new HashMap<String, Integer>();

        url_maps.put("Tecnoparque nodo Valledupar", R.drawable.imagen1);
        url_maps.put("Colegio Fisher Kids", R.drawable.imagen2);


        for (String name : url_maps.keySet()) {
            TextSliderView textSliderView = new TextSliderView(view.getContext());//
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
        mDemoSlider.setDuration(4000);

        // BOTONES

        ImageButton button1 = (ImageButton) view.findViewById(R.id.fb);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/Monumentos-Valledupar-1268416656524699/?fref=ts"));
                startActivity(intent1);
            }
        });

        ImageButton button2 = (ImageButton) view.findViewById(R.id.in);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/monumentosvalledupar/"));
                startActivity(intent2);
            }
        });

        ImageButton button3 = (ImageButton) view.findViewById(R.id.tw);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/MonumentosValle"));
                startActivity(intent3);
            }
        });

        return view;

    }

}
