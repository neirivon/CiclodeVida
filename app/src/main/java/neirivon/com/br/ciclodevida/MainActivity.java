package neirivon.com.br.ciclodevida;

import android.content.Intent;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends DebugActivity
{

    public void navegar(View v) {
        Intent i = new Intent(this, SegundaActivity.class);
        i.putExtra("nome",((EditText)findViewById(R.id.nome)).getText().toString());
        startActivity(i);
    }

}
