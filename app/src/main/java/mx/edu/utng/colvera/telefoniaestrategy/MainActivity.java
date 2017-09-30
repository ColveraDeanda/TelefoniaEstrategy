package mx.edu.utng.colvera.telefoniaestrategy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner cmbOpciones;
    EditText txtMinutosLocal;
    EditText txtMinutosLD;
    EditText txtTotal;
    Button btnCalcular;
    Button btnLimpiar;
    int op; //compañia seleccionada
    Contexto contexto;
    private Button btncreditos;
    String[] opciones ={"Telcel","Unefon","Fictional"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //Relacionando los controles con la vista
        cmbOpciones = (Spinner)findViewById(R.id.cmb_opciones);
        txtMinutosLocal = (EditText)findViewById(R.id.txt_local);
        txtMinutosLD = (EditText)findViewById(R.id.txt_minutos_id);
        txtTotal = (EditText)findViewById(R.id.txt_total);
        btnCalcular = (Button)findViewById(R.id.btn_calcular);
        btnLimpiar = (Button)findViewById(R.id.btn_limpiar);
        cmbOpciones.setOnItemSelectedListener(this);
        btncreditos = (Button)findViewById(R.id.btn_creditos);

        btncreditos.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(),CreditosActivity.class);
                startActivity(intent);

            }
        });



        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int minutosLocal;
                int minutosLD;
                double total=0;

                minutosLocal = Integer.parseInt(txtMinutosLocal.getText().toString());
                minutosLD = Integer.parseInt(txtMinutosLD.getText().toString());

                total = contexto.calcularTarifaLocal(minutosLocal)+
                        contexto.calcularTafifaLD(minutosLD);

                txtTotal.setText(""+total);
            }
        });

        btnLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        op = (int)cmbOpciones.getSelectedItemId()+1;
        switch (op){
            case 1:
                contexto = new Contexto(new Telcel());
                break;
            case 2:
                contexto = new Contexto(new Unefon());
                break;
            case 3:
                contexto = new Contexto(new MyCompany());
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
        op = 1;
    }
}
