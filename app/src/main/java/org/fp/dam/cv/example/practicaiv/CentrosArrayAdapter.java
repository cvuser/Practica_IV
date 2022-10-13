package org.fp.dam.cv.example.practicaiv;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

public class CentrosArrayAdapter extends ArrayAdapter<Centro> {

    public CentrosArrayAdapter(@NonNull Context context, int resource, List<Centro> centros){
        super(context, resource, centros);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            convertView= LayoutInflater.from(this.getContext()).inflate(R.layout.imagen,parent,false);
        }
        TextView nombre=(TextView) convertView.findViewById(R.id.nombre);
        TextView direccion=(TextView) convertView.findViewById(R.id.direccion);
        ImageView imagen=(ImageView) convertView.findViewById(R.id.imagen);
        Centro centro=getItem(position);
        nombre.setText(centro.nombre);
        direccion.setText(centro.direccion);
        imagen.setImageResource(centro.imagen);
        return convertView;
    }
}
