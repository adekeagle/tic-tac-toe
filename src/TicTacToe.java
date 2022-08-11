import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe {

    private boolean whose_move = true;

    JFrame ramka;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;
    GridLayout grid;
    boolean wynik = false;

    public TicTacToe() {
        grid = new GridLayout(3, 3);
        ramka = new JFrame("Kółko i krzyżyk");
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        button6 = new JButton();
        button7 = new JButton();
        button8 = new JButton();
        button9 = new JButton();

        button1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                if (whose_move == true) {
                    button1.setText("x");
                    button1.setEnabled(false);
                    whose_move = !whose_move;

                } else {
                    button1.setText("O");
                    button1.setEnabled(false);
                    whose_move = !whose_move;

                }

                wynik = whoWins();

                if(wynik) {
                    JOptionPane.showMessageDialog(null, "Wygrana!");
                    reset();
                }

            }

        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (whose_move == true) {
                    button2.setText("x");
                    button2.setEnabled(false);
                    whose_move = !whose_move;
                } else {
                    button2.setText("O");
                    button2.setEnabled(false);
                    whose_move = !whose_move;
                }

                wynik = whoWins();

                if(wynik) {
                    JOptionPane.showMessageDialog(null, "Wygrana!");
                    reset();
                }
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (whose_move == true) {
                    button3.setText("x");
                    button3.setEnabled(false);
                    whose_move = !whose_move;
                } else {
                    button3.setText("O");
                    button3.setEnabled(false);
                    whose_move = !whose_move;
                }

                wynik = whoWins();

                if(wynik) {
                    JOptionPane.showMessageDialog(null, "Wygrana!");
                    reset();
                }
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (whose_move == true) {
                    button4.setText("x");
                    button4.setEnabled(false);
                    whose_move = !whose_move;
                } else {
                    button4.setText("O");
                    button4.setEnabled(false);
                    whose_move = !whose_move;
                }

                wynik = whoWins();

                if(wynik) {
                    JOptionPane.showMessageDialog(null, "Wygrana!");
                    reset();

                }
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (whose_move == true) {
                    button5.setText("x");
                    button5.setEnabled(false);
                    whose_move = !whose_move;
                } else {
                    button5.setText("O");
                    button5.setEnabled(false);
                    whose_move = !whose_move;
                }

                wynik = whoWins();

                if(wynik) {
                    JOptionPane.showMessageDialog(null, "Wygrana!");
                    reset();
                }
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (whose_move == true) {
                    button6.setText("x");
                    button6.setEnabled(false);
                    whose_move = !whose_move;
                } else {
                    button6.setText("O");
                    button6.setEnabled(false);
                    whose_move = !whose_move;
                }

                wynik = whoWins();

                if(wynik) {
                    JOptionPane.showMessageDialog(null, "Wygrana!");
                    reset();
                }
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (whose_move == true) {
                    button7.setText("x");
                    button7.setEnabled(false);
                    whose_move = !whose_move;
                } else {
                    button7.setText("O");
                    button7.setEnabled(false);
                    whose_move = !whose_move;
                }

                wynik = whoWins();

                if(wynik) {
                    JOptionPane.showMessageDialog(null, "Wygrana!");
                    reset();
                }
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (whose_move == true) {
                    button8.setText("x");
                    button8.setEnabled(false);
                    whose_move = !whose_move;
                } else {
                    button8.setText("O");
                    button8.setEnabled(false);
                    whose_move = !whose_move;
                }

                wynik = whoWins();

                if(wynik) {
                    JOptionPane.showMessageDialog(null, "Wygrana!");
                    reset();
                }
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (whose_move == true) {
                    button9.setText("x");
                    button9.setEnabled(false);
                    whose_move = !whose_move;
                } else {
                    button9.setText("O");
                    button9.setEnabled(false);
                    whose_move = !whose_move;
                }

                wynik = whoWins();

                if(wynik) {
                    JOptionPane.showMessageDialog(null, "Wygrana!");
                    reset();
                }
            }


        });

        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ramka.setSize(300, 300);
        ramka.setLayout(grid);
        ramka.setResizable(false);

        ramka.add(button1);
        ramka.add(button2);
        ramka.add(button3);
        ramka.add(button4);
        ramka.add(button5);
        ramka.add(button6);
        ramka.add(button7);
        ramka.add(button8);
        ramka.add(button9);

        ramka.setVisible(true);
    }

    private boolean whoWins(){
        if(button1.getText().equals(button2.getText()) && button2.getText().equals(button3.getText()) && !button1.getText().equals("")) {
            return true;
        }else if(button4.getText().equals(button5.getText()) && button5.getText().equals(button6.getText()) && !button4.getText().equals("")){
            return true;
        }else if(button7.getText().equals(button8.getText()) && button8.getText().equals(button9.getText()) && !button7.getText().equals("")){
            return true;
        }else if(button1.getText().equals(button4.getText()) && button4.getText().equals(button7.getText()) && !button1.getText().equals("")) {
            return true;
        }else if(button1.getText().equals(button2.getText()) && button2.getText().equals(button3.getText()) && !button1.getText().equals("")) {
            return true;
        }else if(button2.getText().equals(button5.getText()) && button5.getText().equals(button8.getText()) && !button5.getText().equals("")) {
            return true;
        }else if(button3.getText().equals(button6.getText()) && button6.getText().equals(button9.getText()) && !button3.getText().equals("")) {
            return true;
        }else if(button1.getText().equals(button5.getText()) && button5.getText().equals(button9.getText()) && !button1.getText().equals("")) {
            return true;
        }else if(button3.getText().equals(button5.getText()) && button5.getText().equals(button7.getText()) && !button3.getText().equals("")) {
            return true;
        }
        else{
            return false;
        }
    }

    public void reset() {
        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");

        button1.setEnabled(true);
        button2.setEnabled(true);
        button3.setEnabled(true);
        button4.setEnabled(true);
        button5.setEnabled(true);
        button6.setEnabled(true);
        button7.setEnabled(true);
        button8.setEnabled(true);
        button9.setEnabled(true);
    }

}