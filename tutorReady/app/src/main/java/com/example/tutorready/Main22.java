package com.example.tutorready;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Main22 extends AppCompatActivity {

    // this is the action code we use in our intent,
    // this way we know we're looking at the response from our own action

    Button button;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_thongtincanhangiasu);

        button=findViewById(R.id.btn_confirm);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_GET_CONTENT);
                intent.setType("image/+");
                startActivityForResult(Intent.createChooser(intent,"Pick an image"),1);
            }
        });

//        Bundle bundle=getIntent().getExtras();
//        if(bundle!=null){
//            if(bundle.getString("some")!=null){
//                Toast.makeText(getApplicationContext(),"data: "+bundle.getString("some"),Toast.LENGTH_SHORT).show();
//            }
//        }
    }


//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
//
//        super.onActivityResult(requestCode, resultCode, data);
//        if (resultCode == RESULT_OK && requestCode == 1) {
//            ImageView imageView = findViewById(R.id.img_avatar);
//
//            try {
//                InputStream inputStream = getContentResolver().openInputStream(data.getData());
//                Bitmap bitmap = BitmapFactory.decodeStream(inputStream);
//                imageView.setImageBitmap(bitmap);
//            } catch (FileNotFoundException e) {
//                e.printStackTrace();
//            }
//        }
//    }
}
