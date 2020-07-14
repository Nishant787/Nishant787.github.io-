/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swasthya.hetu.karmaanudesha;


import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author NISHANT SHARMA
 */



//Start
public class SwasthyaHetuKarmaanudesha extends Application {
    @Override
    public void start(Stage stage) throws FileNotFoundException{
        
//Background SetUP
Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
Image image = new Image(new FileInputStream("C:\\Swasthya Hetu Karmaanudesha\\Images\\Background image.png"));
ImageView imageView = new ImageView(image);
imageView.setX(0);
imageView.setY(0);
imageView.setFitHeight(screensize.getHeight());
imageView.setFitWidth(screensize.getWidth());
imageView.setPreserveRatio(true);

//Doctors Appointment
Button buttondoctorsappointment=new Button("DOCTORS APPOINTMENT");
buttondoctorsappointment.setLayoutX((screensize.getWidth())-200);
buttondoctorsappointment.setLayoutY((screensize.getHeight())-100);
buttondoctorsappointment.setTextFill(Color.GREEN);
buttondoctorsappointment.setMaxSize(400,200);
buttondoctorsappointment.setOnAction(new EventHandler<ActionEvent>(){
        @Override
       public void handle(ActionEvent event) {
      DoctorsAppointmentAction docapp = new DoctorsAppointmentAction();
            try {
                stage.close();
                docapp.doctorsappointmentaction();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(SwasthyaHetuKarmaanudesha.class.getName()).log(Level.SEVERE, null, ex);
            }
          }
       });

//Doctors Appointment
Button buttonsmoke=new Button("SMOKER: Introspect Yourself");
buttonsmoke.setLayoutX((screensize.getWidth())-200);
buttonsmoke.setLayoutY((screensize.getHeight())-150);
buttonsmoke.setTextFill(Color.GREEN);
buttonsmoke.setMaxSize(400,200);
buttonsmoke.setOnAction(new EventHandler<ActionEvent>(){
        @Override
       public void handle(ActionEvent event) {
      stage.close();
      Smoker smo=new Smoker();
      smo.smoker();
       }
       });

//Group
Group root = new Group(imageView,buttondoctorsappointment,buttonsmoke);
Scene scene = new Scene(root, screensize.getWidth(),screensize.getHeight());
stage.setTitle("swasthyaHetuKarmaanudesha");
stage.setScene(scene);
stage.show();
    
    }
    
   
    public static void main(String[] args) {
        launch(args);
    }
    
}



//Perform Doctor Appointment
class DoctorsAppointmentAction{
void doctorsappointmentaction() throws FileNotFoundException{
Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
Stage primaryStage=new Stage();   
//Doctors appointmentbackground images
Image image1 = new Image(new FileInputStream("C:\\Swasthya Hetu Karmaanudesha\\Images\\Doctors appointment.png"));
ImageView imageView1 = new ImageView(image1);
imageView1.setX(0);
imageView1.setY(0);
imageView1.setFitHeight(screensize.getHeight());
imageView1.setFitWidth(screensize.getWidth());
imageView1.setPreserveRatio(true); 
//Doctors Appointment Back Button
Button buttondoctorsappointmentexit=new Button("EXIT");
buttondoctorsappointmentexit.setLayoutX(0);
buttondoctorsappointmentexit.setLayoutY(0);
buttondoctorsappointmentexit.setTextFill(Color.GREEN);
buttondoctorsappointmentexit.setMaxSize(120,60);
buttondoctorsappointmentexit.setOnAction(new EventHandler<ActionEvent>(){
@Override
public void handle(ActionEvent event) {
        System.exit(0);
   }
});

//Doctors Appointment Back Button
Button buttondoctorsappointmentback=new Button("BACK");
buttondoctorsappointmentback.setLayoutX(40);
buttondoctorsappointmentback.setLayoutY(0);
buttondoctorsappointmentback.setTextFill(Color.GREEN);
buttondoctorsappointmentback.setMaxSize(120,60);
buttondoctorsappointmentback.setOnAction(new EventHandler<ActionEvent>(){
@Override
public void handle(ActionEvent event) {
    SwasthyaHetuKarmaanudesha swahetkar = new SwasthyaHetuKarmaanudesha();
    try {
       primaryStage.close();
        swahetkar.start(primaryStage);
      
    } catch (FileNotFoundException ex) {
        Logger.getLogger(DoctorsAppointmentAction.class.getName()).log(Level.SEVERE, null, ex);
    }
}
});
      Text text=new Text();
       text.setText("--------------Select your state---------");
       text.setFill(Color.WHITE);
       text.setFont(new Font(screensize.getWidth()/30));
       text.setLayoutX(screensize.getWidth()/4);
       text.setLayoutY(50);
       text.setLineSpacing(2);

  //Hostpial List
Button andhrapradesh=new Button("Andhra Pradesh");
andhrapradesh.setLayoutX(screensize.getWidth()/2);
andhrapradesh.setLayoutY(screensize.getHeight()/12);
andhrapradesh.setTextFill(Color.GREEN);
andhrapradesh.setOnAction(new EventHandler<ActionEvent>(){
@Override
public void handle(ActionEvent event) {
    try {
        primaryStage.close();
        AndhraPradesh andpra = new AndhraPradesh();
    } catch (FileNotFoundException ex) {
        Logger.getLogger(DoctorsAppointmentAction.class.getName()).log(Level.SEVERE, null, ex);
    }
}
});
Button assam=new Button("Assam");
assam.setLayoutX(screensize.getWidth()/2);
assam.setLayoutY(screensize.getHeight()/9);
assam.setTextFill(Color.GREEN);
assam.setOnAction(new EventHandler<ActionEvent>(){
@Override
public void handle(ActionEvent event) {
    try {
        primaryStage.close();
        Assam ass = new Assam();
    } catch (FileNotFoundException ex) {
        Logger.getLogger(DoctorsAppointmentAction.class.getName()).log(Level.SEVERE, null, ex);
    }
}
});
Button bihar=new Button("Bihar");
bihar.setLayoutX(screensize.getWidth()/2);
bihar.setLayoutY(screensize.getHeight()/7);
bihar.setTextFill(Color.GREEN);
bihar.setOnAction(new EventHandler<ActionEvent>(){
@Override
public void handle(ActionEvent event) {
    try {
        primaryStage.close();
        Bihar bih = new Bihar();
    } catch (FileNotFoundException ex) {
        Logger.getLogger(DoctorsAppointmentAction.class.getName()).log(Level.SEVERE, null, ex);
    }
}
});


Button chandigarh=new Button("Chandigarh");
chandigarh.setLayoutX(screensize.getWidth()/2);
chandigarh.setLayoutY(screensize.getHeight()/6);
chandigarh.setTextFill(Color.GREEN);
chandigarh.setOnAction(new EventHandler<ActionEvent>(){
@Override
public void handle(ActionEvent event) {
    try {
        primaryStage.close();
        Chandigarh cha = new Chandigarh();
    } catch (FileNotFoundException ex) {
        Logger.getLogger(DoctorsAppointmentAction.class.getName()).log(Level.SEVERE, null, ex);
    }
}
});

Button delhi=new Button("Delhi");
delhi.setLayoutX(screensize.getWidth()/2);
delhi.setLayoutY(screensize.getHeight()/5);
delhi.setTextFill(Color.GREEN);
delhi.setOnAction(new EventHandler<ActionEvent>(){
@Override
public void handle(ActionEvent event) {
    try {
        primaryStage.close();
        Delhi del = new Delhi();
    } catch (FileNotFoundException ex) {
        Logger.getLogger(DoctorsAppointmentAction.class.getName()).log(Level.SEVERE, null, ex);
    }
}
});
Text textnote=new Text();
     textnote.setText("Note: List of all States and Hospitals\n "
               + "will be coming soon ");
     textnote.setFill(Color.RED);
     textnote.setFont(new Font(screensize.getWidth()/30));
     textnote.setLayoutX(screensize.getWidth()/4);
     textnote.setLayoutY(screensize.getHeight()/1.5);     
     textnote.setLineSpacing(2);
       
       
Group root=new Group(imageView1,buttondoctorsappointmentexit,buttondoctorsappointmentback,text,andhrapradesh,assam,bihar,chandigarh,delhi,textnote);
Scene scene = new Scene(root, screensize.getWidth(),screensize.getHeight());
primaryStage.setTitle("swasthyaHetuKarmaanudesha");
primaryStage.setScene(scene);
primaryStage.show();
 }
}




 class AndhraPradesh{
AndhraPradesh() throws FileNotFoundException{
Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
Stage primaryStage2= new Stage();
  Text text=new Text();
       text.setText("List of notable hospitals in Andhra Pradesh");
       text.setFill(Color.BLACK);
       text.setFont(new Font(screensize.getWidth()/30));
       text.setLayoutX(screensize.getWidth()/4);
       text.setLayoutY(50);
       text.setLineSpacing(2);
Button buttondoctorsappointmentexit=new Button("EXIT");
buttondoctorsappointmentexit.setLayoutX(0);
buttondoctorsappointmentexit.setLayoutY(0);
buttondoctorsappointmentexit.setTextFill(Color.GREEN);
buttondoctorsappointmentexit.setMaxSize(120,60);
buttondoctorsappointmentexit.setOnAction(new EventHandler<ActionEvent>(){
@Override
public void handle(ActionEvent event) {
        System.exit(0);
   }
});

// Back Button
Button buttondoctorsappointmentback=new Button("BACK");
buttondoctorsappointmentback.setLayoutX(40);
buttondoctorsappointmentback.setLayoutY(0);
buttondoctorsappointmentback.setTextFill(Color.GREEN);
buttondoctorsappointmentback.setMaxSize(120,60);
buttondoctorsappointmentback.setOnAction(new EventHandler<ActionEvent>(){
@Override
public void handle(ActionEvent event) {
DoctorsAppointmentAction docappact = new DoctorsAppointmentAction();
    try {
        primaryStage2.close();
        docappact.doctorsappointmentaction();
    } catch (FileNotFoundException ex) {
        Logger.getLogger(AndhraPradesh.class.getName()).log(Level.SEVERE, null, ex);
    }
}
});
ObservableList<String> names = FXCollections.observableArrayList("Sri Sathya Sai Institute of Higher Medical Sciences, Puttaparthi","Sri Venkateswara Institute of Medical Sciences (SVIMS)","L. V. Prasad Eye Institute","Siddhartha Medical College, NTR University of Health Sciences","Rainbow Hospitals","Dr. Mohan’s Diabetes Specialities Centre","L. V. Prasad Eye Institute","King George Hospital","Apollo Hospitals, Visakhapatnam","Visakha Institute of Medical Sciences","SevenHills Hospital");
ListView<String> hospitallistView = new ListView<String>(names);
hospitallistView.setOnMouseClicked(new EventHandler<MouseEvent>(){

            @Override
            public void handle(MouseEvent event) {
                primaryStage2.close();
               DoctorsAppointmentform docappfor = new DoctorsAppointmentform();
            }
});
GridPane gridpane=new GridPane();
gridpane.setLayoutX(screensize.getWidth()/4);
gridpane.setLayoutY(screensize.getHeight()/6);
gridpane.add(hospitallistView, 0, 0);
Group root=new Group(buttondoctorsappointmentback,buttondoctorsappointmentexit,text,gridpane);
Scene scene = new Scene(root, screensize.getWidth(),screensize.getHeight());
primaryStage2.setTitle("swasthyaHetuKarmaanudesha");
primaryStage2.setScene(scene);
primaryStage2.show();
     }
 }

class Assam{
    Assam() throws FileNotFoundException{
    Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
Stage primaryStage2= new Stage();
  Text text=new Text();
       text.setText("List of notable hospitals in Assam");
       text.setFill(Color.BLACK);
       text.setFont(new Font(screensize.getWidth()/30));
       text.setLayoutX(screensize.getWidth()/4);
       text.setLayoutY(50);
       text.setLineSpacing(2);
Button buttondoctorsappointmentexit=new Button("EXIT");
buttondoctorsappointmentexit.setLayoutX(0);
buttondoctorsappointmentexit.setLayoutY(0);
buttondoctorsappointmentexit.setTextFill(Color.GREEN);
buttondoctorsappointmentexit.setMaxSize(120,60);
buttondoctorsappointmentexit.setOnAction(new EventHandler<ActionEvent>(){
@Override
public void handle(ActionEvent event) {
        System.exit(0);
   }
});

// Back Button
Button buttondoctorsappointmentback=new Button("BACK");
buttondoctorsappointmentback.setLayoutX(40);
buttondoctorsappointmentback.setLayoutY(0);
buttondoctorsappointmentback.setTextFill(Color.GREEN);
buttondoctorsappointmentback.setMaxSize(120,60);
buttondoctorsappointmentback.setOnAction(new EventHandler<ActionEvent>(){
@Override
public void handle(ActionEvent event) {
DoctorsAppointmentAction docappact = new DoctorsAppointmentAction();
    try {
        primaryStage2.close();
        docappact.doctorsappointmentaction();
    } catch (FileNotFoundException ex) {
        Logger.getLogger(AndhraPradesh.class.getName()).log(Level.SEVERE, null, ex);
    }
}
});
ObservableList<String> names = FXCollections.observableArrayList("Gauhati Medical College and Hospital","Dr. B. Borooah Cancer Institute","Narayana Superspeciality Hospital","Apollo Hospitals","Assam Medical College","SMCH – Silchar Medical College and Hospital","Jorhat Medical College and Hospital","Medical Institute Jorhat","Tezpur Medical College and Hospital","Lokopriya Gopinath Bordoloi Regional Institute of Mental Health","Diphu Medical College and Hospital","Fakhruddin Ali Ahmed Medical College and Hospital");
ListView<String> hospitallistView = new ListView<String>(names);
hospitallistView.setOnMouseClicked(new EventHandler<MouseEvent>(){

            @Override
            public void handle(MouseEvent event) {
                primaryStage2.close();
               DoctorsAppointmentform docappfor = new DoctorsAppointmentform();
            }
});
GridPane gridpane=new GridPane();
gridpane.setLayoutX(screensize.getWidth()/4);
gridpane.setLayoutY(screensize.getHeight()/6);
gridpane.add(hospitallistView, 0, 0);
Group root=new Group(buttondoctorsappointmentback,buttondoctorsappointmentexit,text,gridpane);
Scene scene = new Scene(root, screensize.getWidth(),screensize.getHeight());
primaryStage2.setTitle("swasthyaHetuKarmaanudesha");
primaryStage2.setScene(scene);
primaryStage2.show();
    }
}
class Bihar{
    Bihar() throws FileNotFoundException{
    Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
Stage primaryStage2= new Stage();
  Text text=new Text();
       text.setText("List of notable hospitals in Bihar");
       text.setFill(Color.BLACK);
       text.setFont(new Font(screensize.getWidth()/30));
       text.setLayoutX(screensize.getWidth()/4);
       text.setLayoutY(50);
       text.setLineSpacing(2);
Button buttondoctorsappointmentexit=new Button("EXIT");
buttondoctorsappointmentexit.setLayoutX(0);
buttondoctorsappointmentexit.setLayoutY(0);
buttondoctorsappointmentexit.setTextFill(Color.GREEN);
buttondoctorsappointmentexit.setMaxSize(120,60);
buttondoctorsappointmentexit.setOnAction(new EventHandler<ActionEvent>(){
@Override
public void handle(ActionEvent event) {
        System.exit(0);
   }
});

// Back Button
Button buttondoctorsappointmentback=new Button("BACK");
buttondoctorsappointmentback.setLayoutX(40);
buttondoctorsappointmentback.setLayoutY(0);
buttondoctorsappointmentback.setTextFill(Color.GREEN);
buttondoctorsappointmentback.setMaxSize(120,60);
buttondoctorsappointmentback.setOnAction(new EventHandler<ActionEvent>(){
@Override
public void handle(ActionEvent event) {
DoctorsAppointmentAction docappact = new DoctorsAppointmentAction();
    try {
        primaryStage2.close();
        docappact.doctorsappointmentaction();
    } catch (FileNotFoundException ex) {
        Logger.getLogger(AndhraPradesh.class.getName()).log(Level.SEVERE, null, ex);
    }
}
});
ObservableList<String> names = FXCollections.observableArrayList("Jawaharlal Nehru Medical College and Hospital,Bhagalpur","Darbhanga Medical College and Hospital","Mithila Minority Dental College and Hospital ,Darbhanga","Anugrah Narayan Magadh Medical College and Hospital,Gaya, India","Katihar Medical College,Katihar","Sri Krishna Medical College,Muzaffarpur","AIIMS Patna,Patna","Ford Hospital and Research Centre","Guru Gobind Singh Hospital, Patna Sahib","Indira Gandhi Institute of Medical Sciences (IGIMS)","Mahavir Cancer Institute and Research Centre","Nalanda Medical College Hospital, Kankarbagh","Patna Medical College Hospital, Ashok Raj Path","Narayan Medical College and Hospital,Sasaram");
ListView<String> hospitallistView = new ListView<String>(names);
hospitallistView.setOnMouseClicked(new EventHandler<MouseEvent>(){

            @Override
            public void handle(MouseEvent event) {
                primaryStage2.close();
               DoctorsAppointmentform docappfor = new DoctorsAppointmentform();
            }
});
GridPane gridpane=new GridPane();
gridpane.setLayoutX(screensize.getWidth()/4);
gridpane.setLayoutY(screensize.getHeight()/6);
gridpane.add(hospitallistView, 0, 0);
Group root=new Group(buttondoctorsappointmentback,buttondoctorsappointmentexit,text,gridpane);
Scene scene = new Scene(root, screensize.getWidth(),screensize.getHeight());
primaryStage2.setTitle("swasthyaHetuKarmaanudesha");
primaryStage2.setScene(scene);
primaryStage2.show();
}
}
class Chandigarh
{
    Chandigarh() throws FileNotFoundException
    {
        Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
Stage primaryStage2= new Stage();
  Text text=new Text();
       text.setText("List of notable hospitals in Chandigarh");
       text.setFill(Color.BLACK);
       text.setFont(new Font(screensize.getWidth()/30));
       text.setLayoutX(screensize.getWidth()/4);
       text.setLayoutY(50);
       text.setLineSpacing(2);
// Back Button
Button buttondoctorsappointmentback=new Button("BACK");
buttondoctorsappointmentback.setLayoutX(40);
buttondoctorsappointmentback.setLayoutY(0);
buttondoctorsappointmentback.setTextFill(Color.GREEN);
buttondoctorsappointmentback.setMaxSize(120,60);
buttondoctorsappointmentback.setOnAction(new EventHandler<ActionEvent>(){
@Override
public void handle(ActionEvent event) {
DoctorsAppointmentAction docappact = new DoctorsAppointmentAction();
    try {
        primaryStage2.close();
        docappact.doctorsappointmentaction();
    } catch (FileNotFoundException ex) {
        Logger.getLogger(AndhraPradesh.class.getName()).log(Level.SEVERE, null, ex);
    }
}
});
Button buttondoctorsappointmentexit=new Button("EXIT");
buttondoctorsappointmentexit.setLayoutX(0);
buttondoctorsappointmentexit.setLayoutY(0);
buttondoctorsappointmentexit.setTextFill(Color.GREEN);
buttondoctorsappointmentexit.setMaxSize(120,60);
buttondoctorsappointmentexit.setOnAction(new EventHandler<ActionEvent>(){
@Override
public void handle(ActionEvent event) {
        System.exit(0);
   }
});
ObservableList<String> names = FXCollections.observableArrayList("Post Graduate Institute of Medical Education and Research, Sector 12");
ListView<String> hospitallistView = new ListView<String>(names);
hospitallistView.setOnMouseClicked(new EventHandler<MouseEvent>(){

            @Override
            public void handle(MouseEvent event) {
                primaryStage2.close();
               DoctorsAppointmentform docappfor = new DoctorsAppointmentform();
            }
});
GridPane gridpane=new GridPane();
gridpane.setLayoutX(screensize.getWidth()/4);
gridpane.setLayoutY(screensize.getHeight()/6);
gridpane.add(hospitallistView, 0, 0);
Group root=new Group(buttondoctorsappointmentback,buttondoctorsappointmentexit,text,gridpane);
Scene scene = new Scene(root, screensize.getWidth(),screensize.getHeight());
primaryStage2.setTitle("swasthyaHetuKarmaanudesha");
primaryStage2.setScene(scene);
primaryStage2.show();
    }
}
class Delhi{
    Delhi() throws FileNotFoundException{
        Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
Stage primaryStage2= new Stage();
  Text text=new Text();
       text.setText("List of notable hospitals in Delhi");
       text.setFill(Color.BLACK);
       text.setFont(new Font(screensize.getWidth()/30));
       text.setLayoutX(screensize.getWidth()/4);
       text.setLayoutY(50);
       text.setLineSpacing(2);
Button buttondoctorsappointmentexit=new Button("EXIT");
buttondoctorsappointmentexit.setLayoutX(0);
buttondoctorsappointmentexit.setLayoutY(0);
buttondoctorsappointmentexit.setTextFill(Color.GREEN);
buttondoctorsappointmentexit.setMaxSize(120,60);
buttondoctorsappointmentexit.setOnAction(new EventHandler<ActionEvent>(){
@Override
public void handle(ActionEvent event) {
        System.exit(0);
   }
});

// Back Button
Button buttondoctorsappointmentback=new Button("BACK");
buttondoctorsappointmentback.setLayoutX(40);
buttondoctorsappointmentback.setLayoutY(0);
buttondoctorsappointmentback.setTextFill(Color.GREEN);
buttondoctorsappointmentback.setMaxSize(120,60);
buttondoctorsappointmentback.setOnAction(new EventHandler<ActionEvent>(){
@Override
public void handle(ActionEvent event) {
DoctorsAppointmentAction docappact = new DoctorsAppointmentAction();
    try {
        primaryStage2.close();
        docappact.doctorsappointmentaction();
    } catch (FileNotFoundException ex) {
        Logger.getLogger(AndhraPradesh.class.getName()).log(Level.SEVERE, null, ex);
    }
}
});

ObservableList<String> names = FXCollections.observableArrayList("All India Institute of Medical Sciences, Ansari Nagar","Columbia Asia, Gurgaon, Haryana 122 017","Cloudnine Hospitals, Mayfield Gardens, Sector 47, Gurgaon, Haryana11","Dr. Mohanâ€™s Diabetes Specialities Centre","Dharamshila Cancer Hospital and Research Centre, Dharamshila Marg, Vasundhara Enclave","Eden Hospital, East of Kailash, New Delhi","Fortis Hospital, Gurgaon","Guru Teg Bahadur Hospital, Dilshad Garden","Holy Family Hospital, Jamia Nagar, Friends Colony","Indraprastha Apollo Hospital, Sarita Vihar","Kasturba Hospital, Daryaganj","Lady Hardinge Medical College, Shaheed Bhagat Singh Marg","Maharaja Agrasen Hospital, West Punjabi Bagh","Maulana Azad Medical College, Bahadur Shah Zafar Marg","Max Healthcare, Max Super Speciality Hospital, Saket, Max Super Speciality Hospital, Patparganj, Max Hospital, Pitampura, Max Medcentre, Panchsheel Park, Max Super Speciality Hospital, Shalimar Bagh, Max Hospital, Noida","Medanta The Medicity, Gurgaon","National Heart Institute (Delhi), Community Centre, East of Kailash","Ram Manohar Lohia Hospital,Baba Kharag Singh Marg","Rajiv Gandhi Cancer Institute and Research Centre, Rohini and Niti bagh","Safdarjang Hospital","Sanjeevan Hospitals, Daryaganj, Paharganj","Sir Ganga Ram Hospital, Rajendar Nagar","St. Stephen's Hospital, Delhi, Tis Hazari","Sunrise Hospital, Kalindi colony","Vidyasagar Institute of Mental Health and Neuro Sciences","World Laparoscopy Hospital, Gurgaon");
ListView<String> hospitallistView = new ListView<String>(names);
hospitallistView.setOnMouseClicked(new EventHandler<MouseEvent>(){

            @Override
            public void handle(MouseEvent event) {
                primaryStage2.close();
               DoctorsAppointmentform docappfor = new DoctorsAppointmentform();
            }
});

           
        
GridPane gridpane=new GridPane();
gridpane.setLayoutX(screensize.getWidth()/4);
gridpane.setLayoutY(screensize.getHeight()/6);
gridpane.add(hospitallistView, 0, 0);
Group root=new Group(buttondoctorsappointmentback,buttondoctorsappointmentexit,text,gridpane);
Scene scene = new Scene(root, screensize.getWidth(),screensize.getHeight());
primaryStage2.setTitle("swasthyaHetuKarmaanudesha");
primaryStage2.setScene(scene);
primaryStage2.show();
    }
    
}

class DoctorsAppointmentform{
    DoctorsAppointmentform(){
 Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
Stage primaryStage3= new Stage();
        
 Text text=new Text("Doctors Appointment");
 text.setFill(Color.BLACK);
       text.setFont(new Font(screensize.getWidth()/30));
       text.setLineSpacing(2);
Text nameLabel = new Text("Name");
TextField nameText = new TextField();
Text dobLabel = new Text("Date of birth");
DatePicker datePicker = new DatePicker();
Text genderLabel = new Text("gender");
ToggleGroup groupGender = new ToggleGroup();
RadioButton maleRadio = new RadioButton("male");
maleRadio.setToggleGroup(groupGender);
RadioButton femaleRadio = new RadioButton("female");
femaleRadio.setToggleGroup(groupGender);
RadioButton otherRadio = new RadioButton("other");
maleRadio.setToggleGroup(groupGender);
Text reservationLabel = new Text("Emergency");
ToggleButton Reservation = new ToggleButton();
ToggleButton yes = new ToggleButton("Yes");
ToggleButton no = new ToggleButton("No");
ToggleGroup groupReservation = new ToggleGroup();
yes.setToggleGroup(groupReservation);
no.setToggleGroup(groupReservation);
Text nameLabel1 = new Text("Email");
TextField nameText1 = new TextField();
Text nameLabel2 = new Text("Phone");
TextField nameText2 = new TextField();
Text nameLabel3 = new Text("Issue");
TextArea nameArea = new TextArea();
Button buttonRegister = new Button("Submit Your request");
buttonRegister.setOnAction(new EventHandler<ActionEvent>(){
@Override
public void handle(ActionEvent event) {
primaryStage3.close();
Text text = new Text("not working yet");
       text.setFill(Color.BLACK);
       text.setFont(new Font(screensize.getWidth()/30));
       text.setLayoutX(screensize.getWidth()/4);
       text.setLayoutY(50);
       text.setLineSpacing(2);
      Stage primaryStage4= new Stage(); 
Group root=new Group(text);
Scene scene = new Scene(root, screensize.getWidth(),screensize.getHeight());
primaryStage4.setTitle("swasthyaHetuKarmaanudesha");
primaryStage4.setScene(scene);
primaryStage4.show();
}
});
Button buttonBack = new Button("Back");
buttonBack.setOnAction(new EventHandler<ActionEvent>(){
@Override
public void handle(ActionEvent event) {
DoctorsAppointmentAction docappact = new DoctorsAppointmentAction();
    try {
        primaryStage3.close();
        docappact.doctorsappointmentaction();
    } catch (FileNotFoundException ex) {
        Logger.getLogger(AndhraPradesh.class.getName()).log(Level.SEVERE, null, ex);
    }
}
});
GridPane gridPane = new GridPane();
gridPane.setMinSize(500, 500);
gridPane.setPadding(new Insets(10, 10, 10, 10));
gridPane.setVgap(5);
gridPane.setHgap(5);
gridPane.setAlignment(Pos.CENTER);
gridPane.add(nameLabel, 0, 0);
gridPane.add(nameText, 1, 0);
gridPane.add(dobLabel, 0, 1);
gridPane.add(datePicker, 1, 1);
gridPane.add(genderLabel, 0, 2);
gridPane.add(maleRadio, 1, 2);
gridPane.add(femaleRadio, 2, 2);
gridPane.add(otherRadio, 3, 2);
gridPane.add(reservationLabel, 0, 3);
gridPane.add(yes, 1, 3);
gridPane.add(no, 2, 3);
gridPane.add(nameLabel1,0,4);
gridPane.add(nameText1,1,4);
gridPane.add(nameLabel2,0,5);
gridPane.add(nameText2,1,5);
gridPane.add(nameLabel3,0,6);
gridPane.add(nameArea,1,6);
gridPane.add(buttonRegister, 1, 7);
gridPane.add(buttonBack, 2, 7);
gridPane.add(text, 3, 0);
buttonRegister.setStyle("-fx-background-color: darkslateblue; -fx-textfill:white;");
nameLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
dobLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
genderLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
reservationLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
nameLabel1.setStyle("-fx-font: normal bold 15px 'serif' ");
nameLabel2.setStyle("-fx-font: normal bold 15px 'serif' ");
nameLabel3.setStyle("-fx-font: normal bold 15px 'serif' ");
gridPane.setStyle("-fx-background-color: BEIGE;");
Group root=new Group(gridPane);
Scene scene = new Scene(root, screensize.getWidth(),screensize.getHeight());
primaryStage3.setTitle("swasthyaHetuKarmaanudesha");
primaryStage3.setScene(scene);
primaryStage3.show();
    }
}



//Smoking Data
class Smoker{
   void smoker(){
        Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
Stage stage1 = new Stage();
Text text=new Text("Your Effected Body Graph");
 text.setFill(Color.BLACK);
       text.setFont(new Font(screensize.getWidth()/30));
       text.setLineSpacing(2);
       Text femaleerror = new Text();
Text nameLabel = new Text("No. of cigarettes/Day");
TextField nameText = new TextField();
Text dobLabel = new Text("Date from you start smoking");
DatePicker datePicker = new DatePicker();
Text dobLabel2 = new Text("Date upto you smoked");
DatePicker datePicker2 = new DatePicker();
Text genderLabel = new Text("gender");
ToggleGroup groupGender = new ToggleGroup();
RadioButton maleRadio = new RadioButton("male");
maleRadio.setToggleGroup(groupGender);
RadioButton femaleRadio = new RadioButton("female");
femaleRadio.setToggleGroup(groupGender);
femaleRadio.setOnMouseClicked(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent event) {
                femaleerror.setText("Smoking Seems More Harmful to Women Than Men");
                femaleerror.setFill(Color.RED);
                femaleerror.setFont(new Font(10));
            }
        });
RadioButton otherRadio = new RadioButton("other");
otherRadio.setToggleGroup(groupGender);
Text nameresult = new Text("You lose:");
Text nameresult1 = new Text();
Text error = new Text();
Text print = new Text();
Text quitsmokingtext =new Text();

Button quitsmoking = new Button();
Button buttonSubmit = new Button("Submit");
buttonSubmit.setOnAction(new EventHandler<ActionEvent>(){
@Override
public void handle(ActionEvent event) {
   
            Integer value1 = Integer.valueOf(nameText.getText());
            String date = datePicker.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            String date2 = datePicker2.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
           String year = date.substring(0,4);
           String mon = date.substring(5,7);
           String day = date.substring(8,10);  
           String years = date2.substring(0,4);
           String mons = date2.substring(5,7);
           String days = date2.substring(8,10);
            int year1=Integer.parseInt(year);
            int mon1=Integer.parseInt(mon);
            int day1=Integer.parseInt(day);
            int year2=Integer.parseInt(years);
            int mon2=Integer.parseInt(mons);
            int day2=Integer.parseInt(days);
           Integer result= (15*value1+(15*value1*(((year2-year1)*365)+((mon1-mon2)*30)+(day2-day1))));
           double resultindays = (result/(60*24));
           String result1 = result.toString();
          
           
           if(result<0){
               print.setFill(Color.ORANGE);
       print.setFont(new Font(screensize.getWidth()/30));
       print.setLineSpacing(2);
               print.setText("You filled incorrect data");
           }
          else if(result==0){
              print.setFill(Color.GREEN);
       print.setFont(new Font(screensize.getWidth()/30));
       print.setLineSpacing(2);
               print.setText("You are safe\nGood Job");
               
          } 
          else{
               nameresult1.setText(result1+" minutes or "+ resultindays +" days of your life");
           nameresult1.setFont(new Font(26));
           nameresult1.setFill(Color.RED);
           nameresult.setFont(new Font(26));
           nameresult.setFill(Color.RED);
              print.setFill(Color.RED);
       print.setFont(new Font(screensize.getWidth()/50));
       print.setLineSpacing(2);
              print.setText("You Are Damaging Your Health");
             quitsmoking.setText("Click Here To Quit Smoking");
quitsmoking.setOnAction(new EventHandler<ActionEvent>(){
@Override
public void handle(ActionEvent event) {
     Stage stage2 = new Stage();
    quitsmokingtext.setText("\nNicotex is best way to quit smoking:\n" +"\n" +"The Nicotine gum comes in six variants - \n" +"Mint Plus, Fruity Mint, Paan, Cinnamon, Classic Fresh Mint and Teeth Whitening\n" +
"\n" +
"Something to\n" +
"go with your belief.\n" +
"\n" +
"How to use Nicotex gums:\n" +
"Although it is in the form of a gum, it isn’t a traditional chewing gum. It’s a \n" +
"carefully crafted product to help you in your mission to quit.\n" +
"\n" +
"\n" +
"Step 1\n" +
"Chew it slowly till you get\n" +
"the taste of nicotine.\n" +
"\n" +
"Step 2\n" +
"Place it between your\n" +
"cheek & gums.\n" +
"\n" +
"Step 3\n" +
"Repeat Step 1 when the\n" +
"taste fades.\n" +
"\n" +
"\n" +
"Week 1 - 6\n" +
"Take 1 Gum every 1-2 hours\n" +
"\n" +
"Week 7 - 9\n" +
"Take 1 Gum every 2-4 hours\n" +
"\n" +
"Week 10 - 12\n" +
"Take 1 Gum every 4-8 hours\n" +
"\n" +
"Consult your Doctor before\n" +
"using Nicotex:\n" +
"-If you are below 18 years of age.\n" +
"-If you are pregnant or breastfeeding.\n" +
"-If you are taking any other medicines, especially those containing anti-asthmatics,\n" +
" anti-psychotic drugs or non-nicotine drugs to stop smoking.\n" +
"-If you have other medical conditions such as uncontrolled high blood pressure, \n" +
"stroke, stomach ulcer, kidney or liver disease, heart or circulation problems, diabetes, \n" +
"allergic reactions, severe sore throat, inflammation of the mouth, overactive thyroid, or adrenal gland cancer.\n" +
"-If you have had previous reactions to nicotine gums or other nicotine-containing products.\n" +
"Nicotex Overdose If you have used more nicotine gums than recommended or, in case, a child\n" +
" has chewed or swallowed some, then contact a doctor immediately. The general symptoms of \n" +
" nicotine overdose include headache, sickness, diarrhoea and stomach pain.");
          quitsmokingtext.setFont(new Font(11));
          quitsmokingtext.setFill(Color.GREEN);
          quitsmokingtext.setX(screensize.getWidth()/10);
          quitsmokingtext.setY(0);
     Button quitbuttondoctorsappointmentexit=new Button("EXIT");
quitbuttondoctorsappointmentexit.setLayoutX(0);
quitbuttondoctorsappointmentexit.setLayoutY(0);
quitbuttondoctorsappointmentexit.setTextFill(Color.GREEN);
quitbuttondoctorsappointmentexit.setMaxSize(120,60);
quitbuttondoctorsappointmentexit.setOnAction(new EventHandler<ActionEvent>(){
@Override
public void handle(ActionEvent event) {
        System.exit(0);
   }
});

// Back Button
Button quitbuttondoctorsappointmentback=new Button("BACK");
quitbuttondoctorsappointmentback.setLayoutX(40);
quitbuttondoctorsappointmentback.setLayoutY(0);
quitbuttondoctorsappointmentback.setTextFill(Color.GREEN);
quitbuttondoctorsappointmentback.setMaxSize(120,60);
quitbuttondoctorsappointmentback.setOnAction(new EventHandler<ActionEvent>(){
@Override
public void handle(ActionEvent event) {
SwasthyaHetuKarmaanudesha swahetkar = new SwasthyaHetuKarmaanudesha();
    try {
       stage2.close();
        swahetkar.start(stage1);
      
    } catch (FileNotFoundException ex) {
        Logger.getLogger(DoctorsAppointmentAction.class.getName()).log(Level.SEVERE, null, ex);
    }
}
}
);
     
Group root = new Group(quitsmokingtext,quitbuttondoctorsappointmentback,quitbuttondoctorsappointmentexit);
Scene scene = new Scene(root, screensize.getWidth(),screensize.getHeight());
stage2.setTitle("swasthyaHetuKarmaanudesha");
stage2.setScene(scene);
stage2.show();
}}
);
}}});
        GridPane gridPane = new GridPane();
gridPane.setMinSize(250, 250);
gridPane.setPadding(new Insets(10,10,10,10));
gridPane.setVgap(5);
gridPane.setHgap(5);
gridPane.setAlignment(Pos.CENTER);
gridPane.add(text, 3, 0);
gridPane.add(nameLabel, 0, 0);
gridPane.add(nameText, 1, 0);
gridPane.add(error, 2, 0);
gridPane.add(dobLabel, 0, 1);
gridPane.add(datePicker, 1, 1);
gridPane.add(dobLabel2, 0, 2);
gridPane.add(datePicker2, 1, 2);
gridPane.add(genderLabel, 0, 3);
gridPane.add(maleRadio, 1, 3);
gridPane.add(femaleRadio, 2, 3);
gridPane.add(otherRadio, 3, 3);
gridPane.add(femaleerror, 4, 3);
gridPane.add(buttonSubmit, 1, 4);
gridPane.add(nameresult, 0, 6);
gridPane.add(nameresult1, 1, 6);
gridPane.add(print, 1, 8);
gridPane.add(quitsmoking,1,9);


buttonSubmit.setStyle("-fx-background-color: darkslateblue; -fx-textfill:white;");
 Button buttondoctorsappointmentexit=new Button("EXIT");
buttondoctorsappointmentexit.setLayoutX(0);
buttondoctorsappointmentexit.setLayoutY(0);
buttondoctorsappointmentexit.setTextFill(Color.GREEN);
buttondoctorsappointmentexit.setMaxSize(120,60);
buttondoctorsappointmentexit.setOnAction(new EventHandler<ActionEvent>(){
@Override
public void handle(ActionEvent event) {
        System.exit(0);
   }
});

// Back Button
Button buttondoctorsappointmentback=new Button("BACK");
buttondoctorsappointmentback.setLayoutX(40);
buttondoctorsappointmentback.setLayoutY(0);
buttondoctorsappointmentback.setTextFill(Color.GREEN);
buttondoctorsappointmentback.setMaxSize(120,60);
buttondoctorsappointmentback.setOnAction(new EventHandler<ActionEvent>(){
@Override
public void handle(ActionEvent event) {
SwasthyaHetuKarmaanudesha swahetkar = new SwasthyaHetuKarmaanudesha();
    try {
       stage1.close();
        swahetkar.start(stage1);
      
    } catch (FileNotFoundException ex) {
        Logger.getLogger(DoctorsAppointmentAction.class.getName()).log(Level.SEVERE, null, ex);
    }
}
}
);

Group root = new Group(gridPane,buttondoctorsappointmentback,buttondoctorsappointmentexit);
Scene scene = new Scene(root, screensize.getWidth(),screensize.getHeight());
stage1.setTitle("swasthyaHetuKarmaanudesha");
stage1.setScene(scene);
stage1.show();
    }
}