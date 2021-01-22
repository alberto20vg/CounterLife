package com.prueba1.magic1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.lifecycle.ViewModelProviders;

public class MainActivity extends AppCompatActivity {
    TextView contador1, contador2, contador3, contador4,
            contadorTierra1, contadorTierra2;

    ImageView sumar1, restar1, tierra_1_1, tierra_1_2, tierra_1_3,
            sumar2, restar2, tierra_2_1, tierra_2_2, tierra_2_3,
            sumar3, restar3, tierra_3_1, tierra_3_2, tierra_3_3,
            sumar4, restar4, tierra_4_1, tierra_4_2, tierra_4_3,
            sumar1_5, restar1_5, sumar2_5, restar2_5, sumar3_5, restar3_5, sumar4_5, restar4_5, reincio;
    ViewModelContador viewModelContador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setContentView(R.layout.activity_main);
        configView();


    }

    private void configView() {
        viewModelContador = ViewModelProviders.of(this).get(ViewModelContador.class);
        contador1 = findViewById(R.id.contador1);
        contador2 = findViewById(R.id.contador2);
        contador3 = findViewById(R.id.contador3);
        contador4 = findViewById(R.id.contador4);

        sumar1 = findViewById(R.id.sumar1);
        sumar2 = findViewById(R.id.sumar2);
        sumar3 = findViewById(R.id.sumar3);
        sumar4 = findViewById(R.id.sumar4);

        sumar1_5 = findViewById(R.id.sumar1_5);
        sumar2_5 = findViewById(R.id.sumar2_5);
        sumar3_5 = findViewById(R.id.sumar3_5);
        sumar4_5 = findViewById(R.id.sumar4_5);

        restar1 = findViewById(R.id.restar1);
        restar2 = findViewById(R.id.restar2);
        restar3 = findViewById(R.id.restar3);
        restar4 = findViewById(R.id.restar4);

        restar1_5 = findViewById(R.id.restar1_5);
        restar2_5 = findViewById(R.id.restar2_5);
        restar3_5 = findViewById(R.id.restar3_5);
        restar4_5 = findViewById(R.id.restar4_5);

        tierra_1_1 = findViewById(R.id.tierra_1_1);
        tierra_1_2 = findViewById(R.id.tierra_1_2);
        tierra_1_3 = findViewById(R.id.tierra_1_3);

        tierra_2_1 = findViewById(R.id.tierra_2_1);
        tierra_2_2 = findViewById(R.id.tierra_2_2);
        tierra_2_3 = findViewById(R.id.tierra_2_3);

        tierra_3_1 = findViewById(R.id.tierra_3_1);
        tierra_3_2 = findViewById(R.id.tierra_3_2);
        tierra_3_3 = findViewById(R.id.tierra_3_3);

        tierra_4_1 = findViewById(R.id.tierra_4_1);
        tierra_4_2 = findViewById(R.id.tierra_4_2);
        tierra_4_3 = findViewById(R.id.tierra_4_3);

        reincio = findViewById(R.id.reinicio);

        reincio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModelContador.setContador1(40);
                contador1.setText("" + viewModelContador.getContador1());

                viewModelContador.setContador2(40);
                contador2.setText("" + viewModelContador.getContador2());

                viewModelContador.setContador3(40);
                contador3.setText("" + viewModelContador.getContador3());

                viewModelContador.setContador4(40);
                contador4.setText("" + viewModelContador.getContador4());

                viewModelContador.setTierra_1_1(0);
                viewModelContador.setTierra_1_2(0);
                viewModelContador.setTierra_1_3(0);

                viewModelContador.setTierra_2_1(0);
                viewModelContador.setTierra_2_2(0);
                viewModelContador.setTierra_2_3(0);

                viewModelContador.setTierra_3_1(0);
                viewModelContador.setTierra_3_2(0);
                viewModelContador.setTierra_3_3(0);

                viewModelContador.setTierra_4_1(0);
                viewModelContador.setTierra_4_2(0);
                viewModelContador.setTierra_4_3(0);


            }
        });

        sumar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModelContador.setContador1(viewModelContador.getContador1() + 1);
                contador1.setText("" + viewModelContador.getContador1());
            }
        });


        sumar1_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModelContador.setContador1(viewModelContador.getContador1() + 5);
                contador1.setText("" + viewModelContador.getContador1());
            }
        });

        restar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModelContador.setContador1(viewModelContador.getContador1() - 1);
                contador1.setText("" + viewModelContador.getContador1());
            }
        });

        restar1_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModelContador.setContador1(viewModelContador.getContador1() - 5);
                contador1.setText("" + viewModelContador.getContador1());
            }
        });

        tierra_1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogTierra_1_1().show();
            }
        });

        tierra_1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogTierra_1_2().show();
            }
        });

        tierra_1_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogTierra_1_3().show();
            }
        });

        sumar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModelContador.setContador2(viewModelContador.getContador2() + 1);
                contador2.setText("" + viewModelContador.getContador2());
            }
        });

        sumar2_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModelContador.setContador2(viewModelContador.getContador2() + 5);
                contador2.setText("" + viewModelContador.getContador2());
            }
        });
        restar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModelContador.setContador2(viewModelContador.getContador2() - 1);
                contador2.setText("" + viewModelContador.getContador2());
            }
        });

        restar2_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModelContador.setContador2(viewModelContador.getContador2() - 5);
                contador2.setText("" + viewModelContador.getContador2());
            }
        });

        tierra_2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogTierra_2_1().show();
            }
        });

        tierra_2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogTierra_2_2().show();
            }
        });

        tierra_2_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogTierra_2_3().show();
            }
        });


        sumar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModelContador.setContador3(viewModelContador.getContador3() + 1);
                contador3.setText("" + viewModelContador.getContador3());
            }
        });

        sumar3_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModelContador.setContador3(viewModelContador.getContador3() + 5);
                contador3.setText("" + viewModelContador.getContador3());
            }
        });
        restar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModelContador.setContador3(viewModelContador.getContador3() - 1);
                contador3.setText("" + viewModelContador.getContador3());
            }
        });

        restar3_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModelContador.setContador3(viewModelContador.getContador3() - 5);
                contador3.setText("" + viewModelContador.getContador3());
            }
        });

        tierra_3_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogTierra_3_1().show();
            }
        });

        tierra_3_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogTierra_3_2().show();
            }
        });

        tierra_3_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogTierra_3_3().show();
            }
        });

        sumar4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModelContador.setContador4(viewModelContador.getContador4() + 1);
                contador4.setText("" + viewModelContador.getContador4());
            }
        });

        sumar4_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModelContador.setContador4(viewModelContador.getContador4() + 5);
                contador4.setText("" + viewModelContador.getContador4());
            }
        });
        restar4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModelContador.setContador4(viewModelContador.getContador4() - 1);
                contador4.setText("" + viewModelContador.getContador4());
            }
        });

        restar4_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModelContador.setContador4(viewModelContador.getContador4() - 5);
                contador4.setText("" + viewModelContador.getContador4());
            }
        });

        tierra_4_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogTierra_4_1().show();
            }
        });

        tierra_4_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogTierra_4_2().show();
            }
        });

        tierra_4_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogTierra_4_3().show();
            }
        });


    }


    public AlertDialog dialogTierra_1_1() {
        final AlertDialog alertDialog;
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        // Get the layout inflater
        LayoutInflater inflater = getLayoutInflater();
        // Inflar y establecer el layout para el dialogo
        // Pasar nulo como vista principal porque va en el diseño del diálogo
        View v = inflater.inflate(R.layout.dialog1, null);
        // builder.setView(inflater.inflate(R.layout.dialog1, null));
        ImageView sumarDialog = v.findViewById(R.id.sumarDialog);
        ImageView restarDialog = v.findViewById(R.id.restarDialog);
        ImageView sumar5Dialog = v.findViewById(R.id.sumar5Dialog);
        ImageView restar5Dialog = v.findViewById(R.id.restar5Dialog);
        final TextView contadorTierra1_1 = v.findViewById(R.id.contadorTierra1);
        builder.setView(v);
        alertDialog = builder.create();
        contadorTierra1_1.setText("" + viewModelContador.getTierra_1_1());

        // Add action buttons
        sumarDialog.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        viewModelContador.setTierra_1_1(viewModelContador.getTierra_1_1() + 1);
                        contadorTierra1_1.setText("" + viewModelContador.getTierra_1_1());
                    }
                }
        );

        sumar5Dialog.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        viewModelContador.setTierra_1_1(viewModelContador.getTierra_1_1() + 5);
                        contadorTierra1_1.setText("" + viewModelContador.getTierra_1_1());
                    }
                }
        );
        restarDialog.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        viewModelContador.setTierra_1_1(viewModelContador.getTierra_1_1() - 1);
                        contadorTierra1_1.setText("" + viewModelContador.getTierra_1_1());
                    }
                }
        );

        restar5Dialog.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        viewModelContador.setTierra_1_1(viewModelContador.getTierra_1_1() - 5);
                        contadorTierra1_1.setText("" + viewModelContador.getTierra_1_1());
                    }
                }
        );

        return alertDialog;
    }


    public AlertDialog dialogTierra_1_2() {
        final AlertDialog alertDialog;
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        // Get the layout inflater
        LayoutInflater inflater = getLayoutInflater();
        // Inflar y establecer el layout para el dialogo
        // Pasar nulo como vista principal porque va en el diseño del diálogo
        View v = inflater.inflate(R.layout.dialog1, null);
        // builder.setView(inflater.inflate(R.layout.dialog1, null));
        ImageView sumarDialog = v.findViewById(R.id.sumarDialog);
        ImageView restarDialog = v.findViewById(R.id.restarDialog);
        ImageView sumar5Dialog = v.findViewById(R.id.sumar5Dialog);
        ImageView restar5Dialog = v.findViewById(R.id.restar5Dialog);
        final TextView contadorTierra1_2 = v.findViewById(R.id.contadorTierra1);
        builder.setView(v);
        alertDialog = builder.create();
        contadorTierra1_2.setText("" + viewModelContador.getTierra_1_2());

        // Add action buttons
        sumarDialog.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        viewModelContador.setTierra_1_2(viewModelContador.getTierra_1_2() + 1);
                        contadorTierra1_2.setText("" + viewModelContador.getTierra_1_2());
                    }
                }
        );

        sumar5Dialog.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        viewModelContador.setTierra_1_2(viewModelContador.getTierra_1_2() + 5);
                        contadorTierra1_2.setText("" + viewModelContador.getTierra_1_2());
                    }
                }
        );
        restarDialog.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        viewModelContador.setTierra_1_2(viewModelContador.getTierra_1_2() - 1);
                        contadorTierra1_2.setText("" + viewModelContador.getTierra_1_2());
                    }
                }
        );

        restar5Dialog.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        viewModelContador.setTierra_1_2(viewModelContador.getTierra_1_2() - 5);
                        contadorTierra1_2.setText("" + viewModelContador.getTierra_1_2());
                    }
                }
        );

        return alertDialog;
    }

    public AlertDialog dialogTierra_1_3() {
        final AlertDialog alertDialog;
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        // Get the layout inflater
        LayoutInflater inflater = getLayoutInflater();
        // Inflar y establecer el layout para el dialogo
        // Pasar nulo como vista principal porque va en el diseño del diálogo
        View v = inflater.inflate(R.layout.dialog1, null);
        // builder.setView(inflater.inflate(R.layout.dialog1, null));
        ImageView sumarDialog = v.findViewById(R.id.sumarDialog);
        ImageView restarDialog = v.findViewById(R.id.restarDialog);
        ImageView sumar5Dialog = v.findViewById(R.id.sumar5Dialog);
        ImageView restar5Dialog = v.findViewById(R.id.restar5Dialog);
        final TextView contadorTierra1_3 = v.findViewById(R.id.contadorTierra1);
        builder.setView(v);
        alertDialog = builder.create();
        contadorTierra1_3.setText("" + viewModelContador.getTierra_1_3());

        // Add action buttons
        sumarDialog.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        viewModelContador.setTierra_1_3(viewModelContador.getTierra_1_3() + 1);
                        contadorTierra1_3.setText("" + viewModelContador.getTierra_1_3());
                    }
                }
        );

        sumar5Dialog.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        viewModelContador.setTierra_1_3(viewModelContador.getTierra_1_3() + 5);
                        contadorTierra1_3.setText("" + viewModelContador.getTierra_1_3());
                    }
                }
        );
        restarDialog.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        viewModelContador.setTierra_1_3(viewModelContador.getTierra_1_3() - 1);
                        contadorTierra1_3.setText("" + viewModelContador.getTierra_1_3());
                    }
                }
        );

        restar5Dialog.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        viewModelContador.setTierra_1_3(viewModelContador.getTierra_1_3() - 5);
                        contadorTierra1_3.setText("" + viewModelContador.getTierra_1_3());
                    }
                }
        );

        return alertDialog;
    }

    public AlertDialog dialogTierra_2_1() {
        final AlertDialog alertDialog;
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        // Get the layout inflater
        LayoutInflater inflater = getLayoutInflater();
        // Inflar y establecer el layout para el dialogo
        // Pasar nulo como vista principal porque va en el diseño del diálogo
        View v = inflater.inflate(R.layout.dialog1, null);
        // builder.setView(inflater.inflate(R.layout.dialog1, null));
        ImageView sumarDialog = v.findViewById(R.id.sumarDialog);
        ImageView restarDialog = v.findViewById(R.id.restarDialog);
        ImageView sumar5Dialog = v.findViewById(R.id.sumar5Dialog);
        ImageView restar5Dialog = v.findViewById(R.id.restar5Dialog);
        final TextView contadorTierra2_1 = v.findViewById(R.id.contadorTierra1);
        builder.setView(v);
        alertDialog = builder.create();
        contadorTierra2_1.setText("" + viewModelContador.getTierra_2_1());

        // Add action buttons
        sumarDialog.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        viewModelContador.setTierra_2_1(viewModelContador.getTierra_2_1() + 1);
                        contadorTierra2_1.setText("" + viewModelContador.getTierra_2_1());
                    }
                }
        );

        sumar5Dialog.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        viewModelContador.setTierra_2_1(viewModelContador.getTierra_2_1() + 5);
                        contadorTierra2_1.setText("" + viewModelContador.getTierra_2_1());
                    }
                }
        );
        restarDialog.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        viewModelContador.setTierra_2_1(viewModelContador.getTierra_2_1() - 1);
                        contadorTierra2_1.setText("" + viewModelContador.getTierra_2_1());
                    }
                }
        );

        restar5Dialog.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        viewModelContador.setTierra_2_1(viewModelContador.getTierra_2_1() - 5);
                        contadorTierra2_1.setText("" + viewModelContador.getTierra_2_1());
                    }
                }
        );

        return alertDialog;
    }


    public AlertDialog dialogTierra_2_2() {
        final AlertDialog alertDialog;
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        // Get the layout inflater
        LayoutInflater inflater = getLayoutInflater();
        // Inflar y establecer el layout para el dialogo
        // Pasar nulo como vista principal porque va en el diseño del diálogo
        View v = inflater.inflate(R.layout.dialog1, null);
        // builder.setView(inflater.inflate(R.layout.dialog1, null));
        ImageView sumarDialog = v.findViewById(R.id.sumarDialog);
        ImageView restarDialog = v.findViewById(R.id.restarDialog);
        ImageView sumar5Dialog = v.findViewById(R.id.sumar5Dialog);
        ImageView restar5Dialog = v.findViewById(R.id.restar5Dialog);
        final TextView contadorTierra2_2 = v.findViewById(R.id.contadorTierra1);
        builder.setView(v);
        alertDialog = builder.create();
        contadorTierra2_2.setText("" + viewModelContador.getTierra_2_2());

        // Add action buttons
        sumarDialog.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        viewModelContador.setTierra_2_2(viewModelContador.getTierra_2_2() + 1);
                        contadorTierra2_2.setText("" + viewModelContador.getTierra_2_2());
                    }
                }
        );

        sumar5Dialog.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        viewModelContador.setTierra_2_2(viewModelContador.getTierra_2_2() + 5);
                        contadorTierra2_2.setText("" + viewModelContador.getTierra_2_2());
                    }
                }
        );
        restarDialog.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        viewModelContador.setTierra_2_2(viewModelContador.getTierra_2_2() - 1);
                        contadorTierra2_2.setText("" + viewModelContador.getTierra_2_2());
                    }
                }
        );

        restar5Dialog.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        viewModelContador.setTierra_2_2(viewModelContador.getTierra_2_2() - 5);
                        contadorTierra2_2.setText("" + viewModelContador.getTierra_2_2());
                    }
                }
        );

        return alertDialog;
    }

    public AlertDialog dialogTierra_2_3() {
        final AlertDialog alertDialog;
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        // Get the layout inflater
        LayoutInflater inflater = getLayoutInflater();
        // Inflar y establecer el layout para el dialogo
        // Pasar nulo como vista principal porque va en el diseño del diálogo
        View v = inflater.inflate(R.layout.dialog1, null);
        // builder.setView(inflater.inflate(R.layout.dialog1, null));
        ImageView sumarDialog = v.findViewById(R.id.sumarDialog);
        ImageView restarDialog = v.findViewById(R.id.restarDialog);
        ImageView sumar5Dialog = v.findViewById(R.id.sumar5Dialog);
        ImageView restar5Dialog = v.findViewById(R.id.restar5Dialog);
        final TextView contadorTierra2_3 = v.findViewById(R.id.contadorTierra1);
        builder.setView(v);
        alertDialog = builder.create();
        contadorTierra2_3.setText("" + viewModelContador.getTierra_2_3());

        // Add action buttons
        sumarDialog.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        viewModelContador.setTierra_2_3(viewModelContador.getTierra_2_3() + 1);
                        contadorTierra2_3.setText("" + viewModelContador.getTierra_2_3());
                    }
                }
        );

        sumar5Dialog.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        viewModelContador.setTierra_2_3(viewModelContador.getTierra_2_3() + 5);
                        contadorTierra2_3.setText("" + viewModelContador.getTierra_2_3());
                    }
                }
        );
        restarDialog.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        viewModelContador.setTierra_2_3(viewModelContador.getTierra_2_3() - 1);
                        contadorTierra2_3.setText("" + viewModelContador.getTierra_2_3());
                    }
                }
        );

        restar5Dialog.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        viewModelContador.setTierra_2_3(viewModelContador.getTierra_2_3() - 5);
                        contadorTierra2_3.setText("" + viewModelContador.getTierra_2_3());
                    }
                }
        );

        return alertDialog;
    }


    public AlertDialog dialogTierra_3_1() {
        final AlertDialog alertDialog;
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        // Get the layout inflater
        LayoutInflater inflater = getLayoutInflater();
        // Inflar y establecer el layout para el dialogo
        // Pasar nulo como vista principal porque va en el diseño del diálogo
        View v = inflater.inflate(R.layout.dialog2, null);
        // builder.setView(inflater.inflate(R.layout.dialog1, null));
        ImageView sumarDialog = v.findViewById(R.id.sumarDialog);
        ImageView restarDialog = v.findViewById(R.id.restarDialog);
        ImageView sumar5Dialog = v.findViewById(R.id.sumar5Dialog);
        ImageView restar5Dialog = v.findViewById(R.id.restar5Dialog);
        final TextView contadorTierra3_1 = v.findViewById(R.id.contadorTierra2);
        builder.setView(v);
        alertDialog = builder.create();
        contadorTierra3_1.setText("" + viewModelContador.getTierra_3_1());

        // Add action buttons
        sumarDialog.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        viewModelContador.setTierra_3_1(viewModelContador.getTierra_3_1() + 1);
                        contadorTierra3_1.setText("" + viewModelContador.getTierra_3_1());
                    }
                }
        );

        sumar5Dialog.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        viewModelContador.setTierra_3_1(viewModelContador.getTierra_3_1() + 5);
                        contadorTierra3_1.setText("" + viewModelContador.getTierra_3_1());
                    }
                }
        );
        restarDialog.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        viewModelContador.setTierra_3_1(viewModelContador.getTierra_3_1() - 1);
                        contadorTierra3_1.setText("" + viewModelContador.getTierra_3_1());
                    }
                }
        );

        restar5Dialog.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        viewModelContador.setTierra_3_1(viewModelContador.getTierra_3_1() - 5);
                        contadorTierra3_1.setText("" + viewModelContador.getTierra_3_1());
                    }
                }
        );

        return alertDialog;
    }


    public AlertDialog dialogTierra_3_2() {
        final AlertDialog alertDialog;
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        // Get the layout inflater
        LayoutInflater inflater = getLayoutInflater();
        // Inflar y establecer el layout para el dialogo
        // Pasar nulo como vista principal porque va en el diseño del diálogo
        View v = inflater.inflate(R.layout.dialog2, null);
        // builder.setView(inflater.inflate(R.layout.dialog1, null));
        ImageView sumarDialog = v.findViewById(R.id.sumarDialog);
        ImageView restarDialog = v.findViewById(R.id.restarDialog);
        ImageView sumar5Dialog = v.findViewById(R.id.sumar5Dialog);
        ImageView restar5Dialog = v.findViewById(R.id.restar5Dialog);
        final TextView contadorTierra3_2 = v.findViewById(R.id.contadorTierra2);
        builder.setView(v);
        alertDialog = builder.create();
        contadorTierra3_2.setText("" + viewModelContador.getTierra_3_2());

        // Add action buttons
        sumarDialog.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        viewModelContador.setTierra_3_2(viewModelContador.getTierra_3_2() + 1);
                        contadorTierra3_2.setText("" + viewModelContador.getTierra_3_2());
                    }
                }
        );

        sumar5Dialog.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        viewModelContador.setTierra_3_2(viewModelContador.getTierra_3_2() + 5);
                        contadorTierra3_2.setText("" + viewModelContador.getTierra_3_2());
                    }
                }
        );
        restarDialog.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        viewModelContador.setTierra_3_2(viewModelContador.getTierra_3_2() - 1);
                        contadorTierra3_2.setText("" + viewModelContador.getTierra_3_2());
                    }
                }
        );

        restar5Dialog.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        viewModelContador.setTierra_3_2(viewModelContador.getTierra_3_2() - 5);
                        contadorTierra3_2.setText("" + viewModelContador.getTierra_3_2());
                    }
                }
        );

        return alertDialog;
    }

    public AlertDialog dialogTierra_3_3() {
        final AlertDialog alertDialog;
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        // Get the layout inflater
        LayoutInflater inflater = getLayoutInflater();
        // Inflar y establecer el layout para el dialogo
        // Pasar nulo como vista principal porque va en el diseño del diálogo
        View v = inflater.inflate(R.layout.dialog2, null);
        // builder.setView(inflater.inflate(R.layout.dialog1, null));
        ImageView sumarDialog = v.findViewById(R.id.sumarDialog);
        ImageView restarDialog = v.findViewById(R.id.restarDialog);
        ImageView sumar5Dialog = v.findViewById(R.id.sumar5Dialog);
        ImageView restar5Dialog = v.findViewById(R.id.restar5Dialog);
        final TextView contadorTierra3_3 = v.findViewById(R.id.contadorTierra2);
        builder.setView(v);
        alertDialog = builder.create();
        contadorTierra3_3.setText("" + viewModelContador.getTierra_3_3());

        // Add action buttons
        sumarDialog.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        viewModelContador.setTierra_3_3(viewModelContador.getTierra_3_3() + 1);
                        contadorTierra3_3.setText("" + viewModelContador.getTierra_3_3());
                    }
                }
        );

        sumar5Dialog.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        viewModelContador.setTierra_3_3(viewModelContador.getTierra_3_3() + 5);
                        contadorTierra3_3.setText("" + viewModelContador.getTierra_3_3());
                    }
                }
        );
        restarDialog.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        viewModelContador.setTierra_3_3(viewModelContador.getTierra_3_3() - 1);
                        contadorTierra3_3.setText("" + viewModelContador.getTierra_3_3());
                    }
                }
        );

        restar5Dialog.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        viewModelContador.setTierra_3_3(viewModelContador.getTierra_3_3() - 5);
                        contadorTierra3_3.setText("" + viewModelContador.getTierra_3_3());
                    }
                }
        );

        return alertDialog;
    }

    public AlertDialog dialogTierra_4_1() {
        final AlertDialog alertDialog;
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        // Get the layout inflater
        LayoutInflater inflater = getLayoutInflater();
        // Inflar y establecer el layout para el dialogo
        // Pasar nulo como vista principal porque va en el diseño del diálogo
        View v = inflater.inflate(R.layout.dialog2, null);
        // builder.setView(inflater.inflate(R.layout.dialog1, null));
        ImageView sumarDialog = v.findViewById(R.id.sumarDialog);
        ImageView restarDialog = v.findViewById(R.id.restarDialog);
        ImageView sumar5Dialog = v.findViewById(R.id.sumar5Dialog);
        ImageView restar5Dialog = v.findViewById(R.id.restar5Dialog);
        final TextView contadorTierra4_1 = v.findViewById(R.id.contadorTierra2);
        builder.setView(v);
        alertDialog = builder.create();
        contadorTierra4_1.setText("" + viewModelContador.getTierra_4_1());

        // Add action buttons
        sumarDialog.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        viewModelContador.setTierra_4_1(viewModelContador.getTierra_4_1() + 1);
                        contadorTierra4_1.setText("" + viewModelContador.getTierra_4_1());
                    }
                }
        );

        sumar5Dialog.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        viewModelContador.setTierra_4_1(viewModelContador.getTierra_4_1() + 5);
                        contadorTierra4_1.setText("" + viewModelContador.getTierra_4_1());
                    }
                }
        );
        restarDialog.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        viewModelContador.setTierra_4_1(viewModelContador.getTierra_4_1() - 1);
                        contadorTierra4_1.setText("" + viewModelContador.getTierra_4_1());
                    }
                }
        );

        restar5Dialog.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        viewModelContador.setTierra_4_1(viewModelContador.getTierra_4_1() - 5);
                        contadorTierra4_1.setText("" + viewModelContador.getTierra_4_1());
                    }
                }
        );

        return alertDialog;
    }


    public AlertDialog dialogTierra_4_2() {
        final AlertDialog alertDialog;
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        // Get the layout inflater
        LayoutInflater inflater = getLayoutInflater();
        // Inflar y establecer el layout para el dialogo
        // Pasar nulo como vista principal porque va en el diseño del diálogo
        View v = inflater.inflate(R.layout.dialog2, null);
        // builder.setView(inflater.inflate(R.layout.dialog1, null));
        ImageView sumarDialog = v.findViewById(R.id.sumarDialog);
        ImageView restarDialog = v.findViewById(R.id.restarDialog);
        ImageView sumar5Dialog = v.findViewById(R.id.sumar5Dialog);
        ImageView restar5Dialog = v.findViewById(R.id.restar5Dialog);
        final TextView contadorTierra4_2 = v.findViewById(R.id.contadorTierra2);
        builder.setView(v);
        alertDialog = builder.create();
        contadorTierra4_2.setText("" + viewModelContador.getTierra_4_2());

        // Add action buttons
        sumarDialog.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        viewModelContador.setTierra_4_2(viewModelContador.getTierra_4_2() + 1);
                        contadorTierra4_2.setText("" + viewModelContador.getTierra_4_2());
                    }
                }
        );

        sumar5Dialog.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        viewModelContador.setTierra_4_2(viewModelContador.getTierra_4_2() + 5);
                        contadorTierra4_2.setText("" + viewModelContador.getTierra_4_2());
                    }
                }
        );
        restarDialog.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        viewModelContador.setTierra_4_2(viewModelContador.getTierra_4_2() - 1);
                        contadorTierra4_2.setText("" + viewModelContador.getTierra_4_2());
                    }
                }
        );

        restar5Dialog.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        viewModelContador.setTierra_4_2(viewModelContador.getTierra_4_2() - 5);
                        contadorTierra4_2.setText("" + viewModelContador.getTierra_4_2());
                    }
                }
        );

        return alertDialog;
    }

    public AlertDialog dialogTierra_4_3() {
        final AlertDialog alertDialog;
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        // Get the layout inflater
        LayoutInflater inflater = getLayoutInflater();
        // Inflar y establecer el layout para el dialogo
        // Pasar nulo como vista principal porque va en el diseño del diálogo
        View v = inflater.inflate(R.layout.dialog2, null);
        // builder.setView(inflater.inflate(R.layout.dialog1, null));
        ImageView sumarDialog = v.findViewById(R.id.sumarDialog);
        ImageView restarDialog = v.findViewById(R.id.restarDialog);
        ImageView sumar5Dialog = v.findViewById(R.id.sumar5Dialog);
        ImageView restar5Dialog = v.findViewById(R.id.restar5Dialog);
        final TextView contadorTierra4_3 = v.findViewById(R.id.contadorTierra2);
        builder.setView(v);
        alertDialog = builder.create();
        contadorTierra4_3.setText("" + viewModelContador.getTierra_4_3());

        // Add action buttons
        sumarDialog.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        viewModelContador.setTierra_4_3(viewModelContador.getTierra_4_3() + 1);
                        contadorTierra4_3.setText("" + viewModelContador.getTierra_4_3());
                    }
                }
        );

        sumar5Dialog.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        viewModelContador.setTierra_4_3(viewModelContador.getTierra_4_3() + 5);
                        contadorTierra4_3.setText("" + viewModelContador.getTierra_4_3());
                    }
                }
        );
        restarDialog.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        viewModelContador.setTierra_4_3(viewModelContador.getTierra_4_3() - 1);
                        contadorTierra4_3.setText("" + viewModelContador.getTierra_4_3());
                    }
                }
        );

        restar5Dialog.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        viewModelContador.setTierra_4_3(viewModelContador.getTierra_4_3() - 5);
                        contadorTierra4_3.setText("" + viewModelContador.getTierra_4_3());
                    }
                }
        );

        return alertDialog;
    }

}