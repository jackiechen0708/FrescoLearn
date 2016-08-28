package fudan.jc.frescolearn;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.facebook.drawee.drawable.ProgressBarDrawable;
import com.facebook.drawee.view.SimpleDraweeView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Uri uri = Uri.parse("http://e.hiphotos.baidu.com/zhidao/wh%3D450%2C600/sign=1ce652c632adcbef01617602999f02eb/8b13632762d0f7035dcbfede0bfa513d2697c5b3.jpg");
        SimpleDraweeView draweeView = (SimpleDraweeView) findViewById(R.id.my_image_view);
        draweeView.setImageURI(uri);
        draweeView.getHierarchy().setProgressBarImage(new ProgressBarDrawable());

    }
}
