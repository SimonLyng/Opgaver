float dimension = 500;//spillepladens størrelse
float space = 200; //afstand mellem kvadraterne
float margin;
PShape green_piece;
PShape red_piece;
int interval=100;

void setup(){
  size(600,600);
  margin = (width-dimension)/2; // Afstanden fra kanten af sketchen hen til ydre kvadrat
  
  //husk at calle functions
  
  drawBricks ();
  drawGamemap () ;
  drawRect () ;
  drawCross () ;

}
void drawBricks () {
  ellipseMode(CENTER);
  green_piece = createShape(ELLIPSE, 0, 0, 50, 50);
  green_piece.setFill(color(0, 255,0));
  red_piece = createShape(ELLIPSE,0, 0, 50, 50);
  red_piece.setFill(color(255, 0,0));
 }
 
 void drawGamemap () {
  rectMode(CENTER); 
  strokeWeight(10);
 rect(width/2, height/2, dimension, dimension);
 rect(width/2, height/2, dimension-space,dimension-space);
 rect(width/2, height/2, dimension-space*2,dimension-space*2);
 }
  
 void drawRect () {

 rect(width/2, height/2, dimension, dimension);
 rect(width/2, height/2, dimension-space,dimension-space);
 rect(width/2, height/2, dimension-space*2,dimension-space*2);

 }


void drawCross () {
  
 line(width/2,margin,width/2,height-margin);  //vertikal linie
 line(margin,height/2,width-margin,height/2); //horisontal linie
  
  
}


  
