package com.example.grupo6.scaleapp;

/*import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class AdaptadorPeso extends RecyclerView.Adapter<AdaptadorPeso.ViewHolder> {
    protected Pesos pesos; // Lista de lugares a mostrar
    protected LayoutInflater inflador; // Crea Layouts a partir del XML
    protected Context contexto; // Lo necesitamos para el inflador



    public AdaptadorPeso(Context contexto, Pesos pesos) {
        this.contexto = contexto;
        this.pesos = pesos;
        inflador = (LayoutInflater) contexto.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    //Creamos nuestro ViewHolder, con los tipos de elementos a modificar
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView peso;
        public TextView altura;
        public TextView hora;

        public ViewHolder(View itemView) {
            super(itemView);
            peso = itemView.findViewById(R.id.peso);
            altura = itemView.findViewById(R.id.altura);
            hora = itemView.findViewById(R.id.hora);
        }
    }
    // Creamos el ViewHolder con la vista de un elemento sin personalizar
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // Inflamos la vista desde el xml
        View v = inflador.inflate(R.layout.elementos, parent, false);
        return new ViewHolder(v);
    }
    // Usando como base el ViewHolder y lo personalizamos
    @Override
    public void onBindViewHolder(ViewHolder holder, int posicion) {
        Peso peso = pesos.elemento(posicion);
       personalizaVista(holder, peso);
    }

    public static void personalizaVista(ViewHolder holder, Peso peso) {
        String peso1 = "" + peso.getPeso();
        holder.peso.setText(peso1);
        String altura = "" + peso.getAltura();
        holder.altura.setText(altura);
        String hora = "" + peso.getHora();
        holder.hora.setText(hora);
    }
    // Indicamos el número de elementos de la lista
    @Override
    public int getItemCount() {
        return pesos.tamanyo();
    }

}*/
