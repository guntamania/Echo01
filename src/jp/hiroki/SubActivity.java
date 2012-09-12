package jp.hiroki;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SubActivity extends Activity {
  @Override
  public void onCreate(Bundle savedInstanceState) {
     super.onCreate(savedInstanceState);
     setContentView(R.layout.sub);

     Button btn = (Button)findViewById(R.id.button2);
     btn.setOnClickListener(new View.OnClickListener() {
    	 @Override
    	 public void onClick(View v) {
    		 // TODO Auto-generated method stub
    		 // 次画面のアクティビティ終了
    		 finish();
    	 }
     });
  }
}