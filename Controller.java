package sample;

import com.sun.org.apache.regexp.internal.RE;
import com.sun.org.apache.regexp.internal.ReaderCharacterIterator;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    public String buttonPressed;
    public TextField TextFieldResult;
    String Number1;
    String Number2;
    Double Result;
    public void onACclick(ActionEvent actionEvent) {
        TextFieldResult.setText("");
    }

    public void onDeletec(ActionEvent actionEvent) {
        String TextF = TextFieldResult.getText();
        /*for(int i = 0; i < TextF.length()-1; i++){
            TextFieldResult.setText(TextF[i]);
        }*/
        TextFieldResult.setText(TextF.substring(0, TextF.length()-1));
    }

    public void onNclick(ActionEvent actionEvent) {
        Button button;
        String TextF;
        String ButtonText;
        button = (Button)actionEvent.getSource();

        ButtonText = button.getText();
        TextF = TextFieldResult.getText();
        TextFieldResult.setText(TextF+ButtonText);
    }


    public void onMulticlick(ActionEvent actionEvent) {
        buttonPressed = "*";
        Number1 = TextFieldResult.getText();
        TextFieldResult.setText("");
    }

    public void onDelclick(ActionEvent actionEvent) {
        buttonPressed = "/";
        Number1 = TextFieldResult.getText();
        TextFieldResult.setText("");
    }

    public void onPlusclick(ActionEvent actionEvent) {
        buttonPressed = "+";
        Number1 = TextFieldResult.getText();
        TextFieldResult.setText("");
    }

    public void onMinusiclick(ActionEvent actionEvent) {
        buttonPressed = "-";
        Number1 = TextFieldResult.getText();
        TextFieldResult.setText("");
    }

    public void onComaclick(ActionEvent actionEvent) {
        String TextF = TextFieldResult.getText();
        TextFieldResult.setText(TextF + ".");
    }

    public void onEqualclick(ActionEvent actionEvent) {
        if(buttonPressed == "+") {
            Number2 = TextFieldResult.getText();
            Result = Double.parseDouble(Number1) + Double.parseDouble(Number2);
            TextFieldResult.setText(Double.toString(Result));
        }
        if(buttonPressed == "-") {
            Number2 = TextFieldResult.getText();
            Result = Double.parseDouble(Number1) - Double.parseDouble(Number2);
            TextFieldResult.setText(Double.toString(Result));
        }
        if(buttonPressed == "*") {
            Number2 = TextFieldResult.getText();
            Result = Double.parseDouble(Number1) * Double.parseDouble(Number2);
            TextFieldResult.setText(Double.toString(Result));
        }
        if(buttonPressed == "/") {
            Number2 = TextFieldResult.getText();
            Result = Double.parseDouble(Number1) / Double.parseDouble(Number2);
            TextFieldResult.setText(Double.toString(Result));
        }
    }
}
