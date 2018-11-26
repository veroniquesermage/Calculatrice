package fr.wildcodeschool.testcalcul;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button zero           = (Button) findViewById(R.id.zero);
        final Button one            = (Button) findViewById(R.id.one);
        final Button two            = (Button) findViewById(R.id.two);
        final Button three          = (Button) findViewById(R.id.three);
        final Button four           = (Button) findViewById(R.id.four);
        final Button five           = (Button) findViewById(R.id.five);
        final Button six            = (Button) findViewById(R.id.six);
        final Button seven          = (Button) findViewById(R.id.seven);
        final Button eight          = (Button) findViewById(R.id.eight);
        final Button nine           = (Button) findViewById(R.id.nine);
        final Button equals         = (Button) findViewById(R.id.equal);
        final Button plus           = (Button) findViewById(R.id.plus);
        final Button minus          = (Button) findViewById(R.id.minus);
        final Button multi          = (Button) findViewById(R.id.multi);
        final Button divide         = (Button) findViewById(R.id.divide);
        final Button comma          = (Button) findViewById(R.id.comma);
        final Button exponent       = (Button) findViewById(R.id.exponent);
        final Button clear          = (Button) findViewById(R.id.clear);
        final Button openingBracket = (Button) findViewById(R.id.openingBracket);
        final Button closingBracket = (Button) findViewById(R.id.closingBracket);
        final ImageButton erase     = (ImageButton) findViewById(R.id.erase);
        final TextView calcul       = (TextView) findViewById(R.id.calcul);
        final TextView result       = (TextView) findViewById(R.id.result);

        final StringBuilder calculation = new StringBuilder();
        final Random random = new Random();

        setTitle(R.string.title);

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculation.append("0");
                calcul.setText(calculation);
                Expression calc = new ExpressionBuilder(calculation.toString()).build();
                double res = calc.evaluate();
                result.setText(String.valueOf(res));
            }
        });

        zero.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int color = Color.argb(random.nextInt(256),random.nextInt(256),random.nextInt(256),random.nextInt(256));
                if(event.getAction() == MotionEvent.ACTION_UP) {
                    zero.setBackgroundColor(Color.WHITE);
                } else if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    zero.setBackgroundColor(color);
                }
                return false;
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculation.append("1");
                calcul.setText(calculation);
                Expression calc = new ExpressionBuilder(calculation.toString()).build();
                double res = calc.evaluate();
                result.setText(String.valueOf(res));

            }
        });
        one.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int color = Color.argb(random.nextInt(256),random.nextInt(256),random.nextInt(256),random.nextInt(256));
                if(event.getAction() == MotionEvent.ACTION_UP) {
                    one.setBackgroundColor(Color.WHITE);
                } else if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    one.setBackgroundColor(color);
                }
                return false;
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculation.append("2");
                calcul.setText(calculation);
                Expression calc = new ExpressionBuilder(calculation.toString()).build();
                double res = calc.evaluate();
                result.setText(String.valueOf(res));
            }
        });
        two.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int color = Color.argb(random.nextInt(256),random.nextInt(256),random.nextInt(256),random.nextInt(256));
                if(event.getAction() == MotionEvent.ACTION_UP) {
                    two.setBackgroundColor(Color.WHITE);
                } else if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    two.setBackgroundColor(color);
                }
                return false;
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculation.append("3");
                calcul.setText(calculation);
                Expression calc = new ExpressionBuilder(calculation.toString()).build();
                double res = calc.evaluate();
                result.setText(String.valueOf(res));
            }
        });
        three.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int color = Color.argb(random.nextInt(256),random.nextInt(256),random.nextInt(256),random.nextInt(256));
                if(event.getAction() == MotionEvent.ACTION_UP) {
                    three.setBackgroundColor(Color.WHITE);
                } else if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    three.setBackgroundColor(color);
                }
                return false;
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculation.append("4");
                calcul.setText(calculation);
                Expression calc = new ExpressionBuilder(calculation.toString()).build();
                double res = calc.evaluate();
                result.setText(String.valueOf(res));
            }
        });
        four.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int color = Color.argb(random.nextInt(256),random.nextInt(256),random.nextInt(256),random.nextInt(256));
                if(event.getAction() == MotionEvent.ACTION_UP) {
                    four.setBackgroundColor(Color.WHITE);
                } else if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    four.setBackgroundColor(color);
                }
                return false;
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculation.append("5");
                calcul.setText(calculation);
                Expression calc = new ExpressionBuilder(calculation.toString()).build();
                double res = calc.evaluate();
                result.setText(String.valueOf(res));
            }
        });
        five.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int color = Color.argb(random.nextInt(256),random.nextInt(256),random.nextInt(256),random.nextInt(256));
                if(event.getAction() == MotionEvent.ACTION_UP) {
                    five.setBackgroundColor(Color.WHITE);
                } else if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    five.setBackgroundColor(color);
                }
                return false;
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculation.append("6");
                calcul.setText(calculation);
                Expression calc = new ExpressionBuilder(calculation.toString()).build();
                double res = calc.evaluate();
                result.setText(String.valueOf(res));
            }
        });
        six.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int color = Color.argb(random.nextInt(256),random.nextInt(256),random.nextInt(256),random.nextInt(256));
                if(event.getAction() == MotionEvent.ACTION_UP) {
                    six.setBackgroundColor(Color.WHITE);
                } else if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    six.setBackgroundColor(color);
                }
                return false;
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculation.append("7");
                calcul.setText(calculation);
                Expression calc = new ExpressionBuilder(calculation.toString()).build();
                double res = calc.evaluate();
                result.setText(String.valueOf(res));
            }
        });
        seven.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int color = Color.argb(random.nextInt(256),random.nextInt(256),random.nextInt(256),random.nextInt(256));
                if(event.getAction() == MotionEvent.ACTION_UP) {
                    seven.setBackgroundColor(Color.WHITE);
                } else if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    seven.setBackgroundColor(color);
                }
                return false;
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculation.append("8");
                calcul.setText(calculation);
                Expression calc = new ExpressionBuilder(calculation.toString()).build();
                double res = calc.evaluate();
                result.setText(String.valueOf(res));
            }
        });
        eight.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int color = Color.argb(random.nextInt(256),random.nextInt(256),random.nextInt(256),random.nextInt(256));
                if(event.getAction() == MotionEvent.ACTION_UP) {
                    eight.setBackgroundColor(Color.WHITE);
                } else if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    eight.setBackgroundColor(color);
                }
                return false;
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculation.append("9");
                calcul.setText(calculation);
                Expression calc = new ExpressionBuilder(calculation.toString()).build();
                double res = calc.evaluate();
                result.setText(String.valueOf(res));
            }
        });
        nine.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int color = Color.argb(random.nextInt(256),random.nextInt(256),random.nextInt(256),random.nextInt(256));
                if(event.getAction() == MotionEvent.ACTION_UP) {
                    nine.setBackgroundColor(Color.WHITE);
                } else if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    nine.setBackgroundColor(color);
                }
                return false;
            }
        });

        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Expression calc = new ExpressionBuilder(calculation.toString()).build();
                double res = calc.evaluate();
                calcul.setText(String.valueOf(res));
                result.setText("");
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculation.append("+");
                calcul.setText(calculation);
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculation.append("-");
                calcul.setText(calculation);
            }
        });

        comma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculation.append(".");
                calcul.setText(calculation);
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculation.append("/");
                calcul.setText(calculation);
            }
        });

        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculation.append("*");
                calcul.setText(calculation);
            }
        });

        exponent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculation.append("^");
                calcul.setText(calculation);
            }
        });

        openingBracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculation.append("(");
                calcul.setText(calculation);
            }
        });

        closingBracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculation.append(")");
                calcul.setText(calculation);
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcul.setText(calculation.delete(0,calculation.length()));
                result.setText(calculation.delete(0,calculation.length()));
            }
        });
        clear.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_UP) {
                    clear.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                } else if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    clear.setBackgroundColor(Color.RED);
                }
                return false;
            }
        });

        erase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculation.deleteCharAt(calculation.length()-1);
                result.setText("");
                calcul.setText(calculation);
            }
        });
        erase.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_UP) {
                    erase.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                } else if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    erase.setBackgroundColor(Color.RED);
                }
                return false;
            }
        });

    }
}
