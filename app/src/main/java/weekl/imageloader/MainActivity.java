package weekl.imageloader;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import weekl.imgloader.ImageLoader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView imageView = findViewById(R.id.imageView);
        final String url = "https://sim-chat-1257177083.cos.ap-guangzhou.myqcloud.com/portrait/201808/34a9801bede3f12caa8310c039f02ceb.jpg";
        final ImageLoader imageLoader = ImageLoader.build(this);
        new Thread(new Runnable() {
            @Override
            public void run() {
                imageLoader.bindBitmap(url,imageView);
            }
        }).start();
    }
}
