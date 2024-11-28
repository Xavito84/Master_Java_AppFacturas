package com.xmartinez.appfacturas;

import com.xmartinez.appfacturas.modelo.*;

import java.util.Scanner;

public class EjemploFactura {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNif("457554-k");
        cliente.setNombre("Lucas");

        Scanner sc = new Scanner (System.in);
        System.out.print("Ingrese la descripcion de la factura: " );
        String desc= sc.nextLine();

        Factura factura = new Factura(desc, cliente);

        Producto producto;

        System.out.println();

        for (int i=0; i<2; i++) {
            producto = new Producto();
            System.out.print("Ingrese producto nª "+ producto.getCodigo()+": ");
            producto.setNombre(sc.nextLine());

            System.out.print("Ingrese el precio: ");
            producto.setPrecio(sc.nextFloat());

            System.out.print("Ingrese la cantidad: ");
            factura.addItemFactura(new ItemFactura(sc.nextInt(), producto));

            System.out.println();
            sc.nextLine();
        }

        System.out.println(factura); // porque hay un toString creado



    }
}
