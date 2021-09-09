color red = color (255, 0, 0);
color green = color(0, 255, 0);
color yellow = color (255, 255, 0);
color grey = color(180);
int count = 0 ;

void setup() {
  size(250, 700);
  background(255);
  fill(0);
  rectMode(CENTER);
  ellipseMode(CENTER);
  fill(180);
  frameRate(1);
}


void draw() {
  fill(0);
  rect(width/2, height/2, 220, 670);
  fill(125);
  ellipse(width/2, height/2, 200, 200);
  ellipse(width/2, height/2+233, 200, 200);
  ellipse(width/2, height/2-233, 200, 200);

  if (count==0) {
    fill(125);
    ellipse(width/2, height/2, 200, 200);
    ellipse(width/2, height/2+233, 200, 200);
    ellipse(width/2, height/2-233, 200, 200);
    
  count+=1;
  } else if (count>0&&count<5) {
    fill(red);
    ellipse(width/2, height/2-233, 200, 200);
    count+=1;
  } else if (count==5) { 
    fill(125);
    ellipse(width/2, height/2-233, 200, 200);
    count+=1;
  } else if ( count>5&&count<10) {
    fill(green);
   ellipse(width/2, height/2+233, 200, 200);
    
   count+=1;
  } else if (count==10) {
  count = 0;
  }
  
}
