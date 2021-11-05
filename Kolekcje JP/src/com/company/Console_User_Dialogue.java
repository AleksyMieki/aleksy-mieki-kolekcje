package com.company;

import java.util.Scanner;

public class Console_User_Dialogue {

    String Main_Menu =
            "Wybierz kolekcje z jakiej chcesz skorzystac:\n" +
                    "1.Set\n" +
                    "2.List\n" +
                    "3.Map\n" +
                    "4.zakonczyc dzialanie programu\n";

        public void run_program()
        {
            SetActions set = new SetActions();
            List list = new List();
            MapActions map= new MapActions();
            Scanner scanner = new Scanner(System.in);

            for(;;)
            {
                System.out.println(Main_Menu);
                int i = scanner.nextInt();

                    switch (i){
                        case 1:
                        {
                            set.actions_Set();
                            break;
                        }
                        case 2: {
                            list.actions_List();
                            break;
                        }
                        case 3:
                        {
                            map.actions_map();
                            break;
                        }
                        case 4: {
                            System.exit(0);
                        }
                    }

            }
        }
}
