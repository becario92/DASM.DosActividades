package master.ejemplos.dosactividades;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class ActividadUno extends Activity {
    
    private final int ACTIVIDAD_DOS = 002;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_actividad_uno);
    }
    
    public void lanzarActividadDos(View v) {
        Intent i = new Intent(this,ActividadDos.class);
        i.putExtra("mensaje", "desde la actividad UNO");
        startActivityForResult(i, ACTIVIDAD_DOS);
    }
    
    @Override
    protected void onActivityResult(int actividad, int resultado, Intent datos) {
        if(actividad==ACTIVIDAD_DOS) {
            if(resultado==RESULT_OK) {
                Toast.makeText(this, "Resultado correcto", Toast.LENGTH_LONG).show();
                String respuesta = datos.getStringExtra("respuesta");
                Toast.makeText(this, respuesta, Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(this, "Resultado erróneo", Toast.LENGTH_LONG).show();
                String respuesta = datos.getStringExtra("respuesta");
                Toast.makeText(this, respuesta, Toast.LENGTH_LONG).show();
            }
        }
    }
    
    
}
