void main() {
    Menu menu = new Menu();
    menu.setOptions(
            "1. Cadastrar",
            "2. Listar",
            "3. Atualizar",
            "4. Remover",
            "0. Sair"
    );
    menu.setPrompt("Opção: ");
    menu.print();
}
