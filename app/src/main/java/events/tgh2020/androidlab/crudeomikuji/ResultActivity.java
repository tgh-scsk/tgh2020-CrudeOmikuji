package events.tgh2020.androidlab.crudeomikuji;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        String name = intent.getStringExtra("NAME");
        String birthday = intent.getStringExtra("BIRTHDAY");

        TextView tv = findViewById(R.id.tvResult);
        FortuneTeller f = new FortuneTeller();
        String fortune = f.tell(birthday);
        tv.setText("こんにちは、\n" + name + " さん\n今日の運勢は " + fortune + " です");

        ImageView iv = findViewById(R.id.imageView);
        int d = f.getDrawable(fortune);
        iv.setImageResource(d);

        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
