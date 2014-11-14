package master.ejemplos.dosactividades;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class ActividadDos extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_actividad_dos);
        
        Intent i = getIntent();
        Bundle extras = i.getExtras();
        String mensaje = extras.getString("mensaje");
        //String mensaje = getIntent().getStringExtra("mensaje");
        
        Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show();
    }
    
    public void responderActividadUno(View v) {
        Intent i = new Intent();
        i.putExtra("respuesta", "OK desde la actividad DOS");
        setResult(RESULT_OK, i);
        finish();
    }
    
    @Override
    public void onBackPressed() {
        Intent i = new Intent();
        i.putExtra("respuesta", "ERROR desde la actividad DOS");
        setResult(RESULT_CANCELED, i);
        super.onBackPressed();
    }
}
