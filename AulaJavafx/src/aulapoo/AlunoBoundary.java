package aulapoo;

import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AlunoBoundary extends Application {
	private TextField txtId = new TextField();
	private TextField txtRa = new TextField();
	private TextField txtNome = new TextField();
	private TextField txtNascimento = new TextField();
	private Button btnAdd = new Button("Adicionar");
	private Button btnPesquisar = new Button("Pesquisar");
	private List<Aluno> lista = new ArrayList<>();
	@Override
	public void start(Stage stage) throws Exception {
		BorderPane border = new BorderPane();
		GridPane grid = new GridPane();
		border.setCenter(grid);
		Scene scn = new Scene(border, 400, 200);
		
		
		grid.add(new Label("ID: "), 0, 0);
		grid.add(txtId, 1, 0);
		grid.add(new Label("RA: "), 0, 1);
		grid.add(txtRa, 1, 1);
		grid.add(new Label("Nome: "), 0, 2);
		grid.add(txtNome, 1, 2);
		grid.add(new Label("Nascimento: "), 0, 3);
		grid.add(txtNascimento, 1, 3);
		grid.setPadding(new Insets (25));
		grid.add(btnAdd, 0, 5);
		grid.add(btnPesquisar, 1, 5);

		btnAdd.setOnAction(e-> {
			Aluno aluno = boundaryToEntity();
			lista.add(aluno);
			clean();
			
		});
		
		btnPesquisar.setOnAction(e-> {
			for (Aluno aluno: lista) {
				if (aluno.getNome().contains(txtNome.getText())) {
					entityToBoundary(aluno);
				}
			}
			
		});
				
		stage.show();
		stage.setScene(scn);
		stage.setTitle("Gestão de Alunos");		
	}
	public Aluno boundaryToEntity() {
		Aluno aluno = new Aluno();
		aluno.setId(Long.parseLong(txtId.getText()));
		aluno.setRa(Long.parseLong(txtRa.getText()));
		aluno.setNome(txtNome.getText());
		aluno.setNascimento(txtNascimento.getText());
		return aluno;
				
	}
	//metodo para limpar os espaços depois de adicionados
	public void clean () { 
		txtId.setText("");
		txtRa.setText("");
		txtNascimento.setText("");
		
	}
	public void entityToBoundary(Aluno aluno) {
		txtId.setText(String.valueOf(aluno.getId()));
		txtRa.setText(String.valueOf(aluno.getRa()));
		txtNome.setText(String.valueOf(aluno.getNome()));
		txtNascimento.setText(String.valueOf(aluno.getNascimento()));
		;
		
	}
	public static void main(String[] args) {
		Application.launch(AlunoBoundary.class, args);
	}
}
