package builder;

 class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.PizzaBuilder()
                .setTamaño("Grande")
                .setMasa("Delgada")
                .setSalsa("Tomate")
                .setExtraQueso(true)
                .setIngredientes(new String[]{"Pepperoni", "Champiñones", "Pimientos"})
                .build();

        System.out.println(pizza);
    }
}
