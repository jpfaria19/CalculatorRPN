package infnet.gads.joaolfaria.calculadorarpn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView display;
    private FullStack<Double> operandStack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = (TextView) findViewById(R.id.display);
        operandStack = new FullStack<Double>();
    }

    public void concatValue(View v){

        String content = display.getText().toString();

        Button btn = (Button) v;

        if (content == "0"){
            display.setText(btn.getText());
        }else{
         display.setText(content + btn.getText());
        }
    }

    public void concatDot(View v){
        //TODO: do later
    }

    public void insertOperand(View v){
        double operand = Double.parseDouble(
                display.getText().toString());
        operandStack.push(operand);
        display.setText("0");
    }

    public void operate(View v){

        Button btn = (Button) v;
        String operator = btn.getText().toString();
        double result = 0.0;
        double second = 0.0;
        double first = 0.0;

        switch (operator){

            case "+":
                second = operandStack.pop();
                first = operandStack.pop();
                result = first + second;
            break;
            case "-":
                second = operandStack.pop();
                first = operandStack.pop();
                result = first + second;
            break;
            case "*":
                second = operandStack.pop();
                first = operandStack.pop();
                result = first + second;
            break;
            case "/":
                second = operandStack.pop();
                first = operandStack.pop();
                result = first + second;
            break;
            default:
                result = 1;
        }
    }

}
