package nhatto.com;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private FloatingActionButton fabMenu, fabAdd, fabSearch;
    boolean anhien = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        initWidget();

    }

    private void initWidget() {
        fabMenu = (FloatingActionButton) findViewById(R.id.fab_menu);
        fabAdd = (FloatingActionButton) findViewById(R.id.fab_add);
        fabSearch = (FloatingActionButton) findViewById(R.id.fab_search);

        fabMenu.setOnClickListener(this);
        fabAdd.setOnClickListener(this);
        fabSearch.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.fab_add:
                ////// TODO: 16/06/2017
                Toast.makeText(this, "Bạn đã chọn add", Toast.LENGTH_SHORT).show();
                break;
            case R.id.fab_search:
                ////// TODO: 16/06/2017
                Toast.makeText(this, "Bạn đã chon Search", Toast.LENGTH_SHORT).show();
                break;
            case R.id.fab_menu:
                ////// TODO: 16/06/2017
                if (anhien == false){
                    hien();
                    anhien = true;
                    Toast.makeText(this, "show", Toast.LENGTH_SHORT).show();
                }else {
                    an();
                    anhien = false;
                    Toast.makeText(this, "hide", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }

    private void hien(){
        fabAdd.show();
        fabSearch.show();
    }

    private  void an(){
        fabAdd.hide();
        fabSearch.hide();
    }
}
