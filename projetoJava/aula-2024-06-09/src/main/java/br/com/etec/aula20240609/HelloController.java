package br.com.etec.aula20240609;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.ArrayList;
import java.util.List;

public class HelloController {

    @FXML
    private Button btmCadastrar;

    @FXML
    private CheckBox chkCasado;

    @FXML
    private ToggleGroup grpSexo;

    @FXML
    private RadioButton rbFeminino;

    @FXML
    private RadioButton rbMasculino;

    @FXML
    private TextArea txtAreaDados;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtTelefone;


    private Cliente cliente;
    private List<Cliente> listaClientes = new ArrayList<>();
    @FXML
    protected void onClickCadastrar() {





    if (txtNome.getText().equals("")) {
        avisoBranco( "Nome em branco");
        txtNome.requestFocus();
        return;
    }
        if (txtEmail.getText().equals("")) {
            avisoBranco( "Nome em branco");
            txtEmail.requestFocus();
            return;
        }
        if (txtTelefone.getText().equals("")) {
            avisoBranco( "Nome em branco");
            txtTelefone.requestFocus();
            return;
        }


        String sexo = rbMasculino.isSelected()? "Masculino" : "feminino";
        int id = listaClientes.size() + 1;
        cliente = new Cliente(id, txtNome.getText(), txtEmail.getText(), txtTelefone.getText(), sexo, chkCasado.isSelected());

        listaClientes.add(cliente);
        txtAreaDados.setText(listaClientes.toString());
        limparCampos();






    }

    private void limparCampos() {
        txtNome.setText("");
        txtEmail.setText("");
        txtTelefone.setText("");
        rbMasculino.setSelected(false);
        rbFeminino.setSelected(false);
        chkCasado.setSelected(false);
        txtNome.requestFocus();
    }

    private void  avisoBranco(String msg) {
        Alert alertaErro = new Alert(Alert.AlertType.ERROR);
        alertaErro.setTitle("erro");
        alertaErro.setContentText("nome em branco");
        alertaErro.setContentText("nome em branco");
        alertaErro.show();
    }
}