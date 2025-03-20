package org.example.collections.map;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class TestMap {

    public static void main(String[] args) {
        Map<String, String> contas = new HashMap<>();

        contas.put("Conta Corrente", "Samuel");
        contas.put("Conta Pagamento", "Eva Reboucas");
        contas.put("Conta Poupança", "Emerson");

        System.out.println(contas);
        System.out.println(contas.get("Conta Corrente"));

        System.out.println(contas.keySet());
    }
    }

