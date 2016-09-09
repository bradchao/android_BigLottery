package tw.brad.biglottery;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.TreeSet;

public class MainActivity extends AppCompatActivity {
    private TextView tvLottery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvLottery = (TextView)findViewById(R.id.tvLottery);

    }
    public void showLottery(View v){
        TreeSet<Integer> setLotterys = new TreeSet<>();
        while (setLotterys.size()<6){
            setLotterys.add((int)(Math.random()*49+1));
        }
        tvLottery.setText("");
        for (Integer lottery : setLotterys){
            tvLottery.append(lottery + "  ");
        }
    }
}
