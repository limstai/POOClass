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

public class CursoBoundary extends Application {
	private TextField txtId = new TextField();
	private TextField txtNome = new TextField();
	private TextField txtcod = new TextField();
	private TextField txtnomeCoord = new TextField();
	private TextField txtqtdAluno = new TextField();
	private Button btnAdd = new Button("Adicionar");
	private Button btnPesquisar = new Button("Pesquisar");
	private List<Curso> lista = new ArrayList<>();

	@Override
	public void start(Stage stage) throws Exception {
		BorderPane border = new BorderPane();
		GridPane grid = new GridPane();
		border.setCenter(grid);
		Scene snc = new Scene(border, 400, 200);
		
		grid.add(new Label("ID: "), 0, 0);
		grid.add(txtId, 1, 0);
		grid.add(new Label("Nome: "), 0, 1);
		grid.add(txtNome, 1, 1);
		grid.add(new Label("Código do Curso: "), 0, 2);
		grid.add(txtcod, 1, 2);
		grid.add(new Label("Nome do Coordenador: "), 0, 3);
		grid.add(txtnomeCoord, 1, 3);
		grid.add(new Label("Quantidade de Alunos: "), 0, 4);
		grid.add(txtqtdAluno, 1, 4);
		grid.setPadding(new Insets(25));
		grid.add(btnAdd, 0, 5);
		grid.add(btnPesquisar, 1, 5);;
		
		btnAdd.setOnAction(e-> {
			Curso curso = boundaryToEntity();
			lista.add(curso);
			clean(); //metodo de limpar os espaços
			
			
		});
		
		btnPesquisar.setOnAction(e-> {
			for (Curso curso: lista) {
				if(curso.getNome().contains(txtNome.getText())) {
					entityToBoundary(curso);										
				}
			}
			
		});
		
		
		stage.show();
		stage.setScene(snc);
		stage.setTitle("Gestão de Cursos");
	}
	//add as info
	public Curso boundaryToEntity() {
		Curso curso = new Curso();
		curso.setId(Long.parseLong(txtId.getText()));
		curso.setNome(txtNome.getText());
		curso.setCod(txtcod.getText());
		curso.setNomeCoord(txtnomeCoord.getText());
		curso.setQtdAluno(Long.parseLong(txtqtdAluno.getText()));
		return curso;
				
	}
	//metodo para limpar os espaços depois de adicionados
	public void clean () { 
		txtId.setText("");
		txtcod.setText("");
		txtnomeCoord.setText("");
		txtqtdAluno.setText("");
		
	}
	public void entityToBoundary(Curso curso) {
		txtId.setText(String.valueOf(curso.getId()));
		txtNome.setText(String.valueOf(curso.getNome()));
		txtcod.setText(String.valueOf(curso.getCod()));
		txtnomeCoord.setText(String.valueOf(curso.getNomeCoord()));
		txtqtdAluno.setText(String.valueOf(curso.getQtdAluno()));		
		
	}
	public static void main (String[] args) {
		Application.launch(CursoBoundary.class, args);
	}

}
