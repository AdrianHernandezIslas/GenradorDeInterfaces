/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author ChuyPablo
 */
public class ModeloTablaServEsc extends ModeloTabla{
    
    public ModeloTablaServEsc()
    {
        encabezado = new String[]{"num_control","nombre","dirección","edad","sexo","semestre","creditos","carrera"};
        tipos = new Class[]{Integer.class,String.class,String.class,Integer.class,String.class,Integer.class,Integer.class,String.class};
    }

    @Override
    public void setValueAt(Object aValue, int r, int c) {
         if(c>0){
            dato.get(r)[c] = (Object) aValue;
            String datos = "UPDATE dsos.estudiante set nombre='"+
                           dato.get(r)[1]+"', direccion='"+dato.get(r)[2]+
                            "', edad="+dato.get(r)[3]+", sexo='"+dato.get(r)[4]+
                            "', semestre="+dato.get(r)[5]+", creditos="+dato.get(r)[6]+", carrera='"+dato.get(r)[7]+"'"+
                    " where numControl = "+dato.get(r)[0];
            baseDatos.actualizarDatos(datos);
        }
        
    }
    
    @Override
    public boolean isCellEditable(int row,int col){
        return col>0;
    }
}
