#include <stdio.h>
#include <stdlib.h>
FILE *fptr,*fptr1,*r;
struct node
{
  int id_num;           //stores the states.
  int st_val;			//indicates whether a state is final or not.
  struct node *link0;	//transition on scanning 0.
  struct node *link1;	//transition on scanning 1.
};
struct node *start, *q, *ptr;			//start indicates the initial state; q allocates temporary memeory.
int vst_arr[100], a[100];				// vst_arr[100] contains the visited states; a[100] stores the current value of a string.
int main()								// main function.
{
	fptr=fopen("C:\\Users\\user pc\\Desktop\\gUiTCSlv\\Programs\\DFA_SIM\\Read_Write\\Output_O\\OutO.txt","w");
	fptr1=fopen("C:\\Users\\user pc\\Desktop\\gUiTCSlv\\Programs\\DFA_SIM\\Read_Write\\Output_A\\OutA.txt","a+");
	r=fopen("C:\\Users\\user pc\\Desktop\\gUiTCSlv\\Programs\\DFA_SIM\\Read_Write\\Input\\InpUT.txt","r");
    if(fptr==NULL)
	{
		//printf("The file does not exist.");
		return 0;
		
	}
	if(fptr1==NULL)
	{
		//printf("The file does not exist.");
		return 0;
		
	}

    int count, i, posi, j, rj;			// count stores the total number of state(s); i,j and rj are temporary counting variables;
  										// posi stores the current state number.
     char n[1000];							// stores the inpute string.
 
  
  fprintf(fptr,"=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=\n");
  fprintf(fptr1,"=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=\n");
  
  fprintf(fptr,"Number of states in the M/C : ");
  fprintf(fptr1,"Number of states in the M/C : ");
  
  fscanf(r,"%d",&count);
  fprintf(fptr,"%d",count);
  fprintf(fptr1,"%d",count);
  
  fprintf(fptr,"\n=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=\n");
  fprintf(fptr1,"\n=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=\n");
  int Nx , fnlstt[count] ;				// Nx stores the number of final state(s); fnlstt[count] stores the final state(s).
  
  fprintf(fptr,"Number of final states : ");
  fprintf(fptr1,"Number of final states : ");
  
  fscanf(r,"%d",&Nx);
  fprintf(fptr,"%d",Nx);
  fprintf(fptr1,"%d",Nx);

  
  if(Nx<=count)							// checks whether the number of final state(s) is less than the total number of states or not.
  for(i=0;i<Nx;i++)
  {
  				// takes input of the final state(s).
  	fprintf(fptr,"\nFinal State (%d) : ",i+1);
  	fprintf(fptr1,"\nFinal State (%d) : ",i+1);
  	fscanf(r,"%d",&fnlstt[i]);
  	fprintf(fptr,"%d",fnlstt[i]);
  	fprintf(fptr1,"%d",fnlstt[i]);
  }
   else
   {
  // printf("\nINCORRECT INPUT");
   
   fprintf(fptr,"\nINCORRECT INPUT\n");
   fprintf(fptr1,"\nINCORRECT INPUT\n");
   }   
   
   fprintf(fptr,"\n=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=\n");
   fprintf(fptr1,"\n=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=\n");

   
   
   q=(struct node *)malloc(sizeof(struct node)*count);	
 
  for(i=0;i<count;i++)
  {
    (q+i)->id_num=i;
    
    fprintf(fptr,"\nState Of Machine :: %d\n",i);
    fprintf(fptr1,"\nState Of Machine :: %d\n",i);
    
    fprintf(fptr,"Next State if scanned symbol is 0 : ");
    fprintf(fptr1,"Next State if scanned symbol is 0 : ");
    fscanf(r,"%d",&posi);
    fprintf(fptr,"%d",posi);
    fprintf(fptr1,"%d",posi);
    
    (q+i)->link0=(q+posi);                                      // loop to store the transition rule.
    
    fprintf(fptr,"\nNext State if scanned symbol is 1 : ");
    fprintf(fptr1,"\nNext State if scanned symbol is 1 : ");
    fscanf(r,"%d",&posi);
    fprintf(fptr,"%d",posi);
    fprintf(fptr1,"%d",posi);
    (q+i)->link1=(q+posi);

    for(rj=0;rj<Nx;rj++)
    {
    if(i==fnlstt[rj])
    (q+i)->st_val=1 ;
    }
    
  }
   
   
   fprintf(fptr,"\n=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=\n");
   fprintf(fptr1,"\n=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=\n");
  
   fprintf(fptr,"Initial State of the M/C : ");
   fprintf(fptr1,"Initial State of the M/C : ");
   fscanf(r,"%d",&posi);										// contains the initial state
   fprintf(fptr,"%d",posi);
   fprintf(fptr1,"%d",posi);
   start=q+posi;										
  
  while(1)
  {
    
    fprintf(fptr,"\n=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=\n");
    fprintf(fptr1,"\n=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=\n");
    
    fprintf(fptr,"Perform String Check ( 0 (for no) / 1 (for yes) )? : ");
    fprintf(fptr1,"Perform String Check ( 0 (for no) / 1 (for yes) )? : ");
    fscanf(r,"%d",&j);									// takes permission for a string simulation
    fprintf(fptr,"%d",j);
    fprintf(fptr1,"%d",j);
    
    if(j)
	{
      ptr=start;
      
      fprintf(fptr,"\nInput string ( with two symbols 0, 1) : ");
      fprintf(fptr1,"\nInput string ( with two symbols 0, 1) : ");
      fscanf(r,"%s",n);
      fprintf(fptr,"%s",n);
      fprintf(fptr1,"%s",n);
      posi=0;
 
      while(n[posi]!='\0')
	  {
      	 a[posi]=(n[posi]-'0');
       	 posi++;
      }
 
      i=0;
      
      fprintf(fptr,"\nThe visited States of the M/C are : ");
      fprintf(fptr1,"\nThe visited States of the M/C are : ");
    
	  do
	  {
        vst_arr[i]=ptr->id_num;
        if(a[i]==0)
	    {
          ptr=ptr->link0;
        }
        else if(a[i]==1)
	    {								   // runs on the string and checks it's validity.
           ptr=ptr->link1;
        }
        else
	    {
          //printf("INCORRECT INPUT\n");
          fprintf(fptr,"\nINCORRECT INPUT\n");
          fprintf(fptr1,"\nINCORRECT INPUT\n");
          return 0;
        }
    //printf("[%d]",vst_arr[i]);
    fprintf(fptr,"[%d]",vst_arr[i]);
    fprintf(fptr1,"[%d]",vst_arr[i]);
    i++;
    

      }
	  while(i<posi);
	  
 	   
 	   fprintf(fptr,"\n");
       
       fprintf(fptr,"\nPresent State : [%d]\n",ptr->id_num);
       fprintf(fptr1,"\nPresent State : [%d]\n",ptr->id_num);
       
       fprintf(fptr,"String Status :: ");
       fprintf(fptr1,"String Status :: ");
      if(ptr->st_val==1)
      {
	  
	  fprintf(fptr,"String Accepted\n");
	  fprintf(fptr1,"String Accepted\n");
	}
      else
      {
		
		fprintf(fptr,"String Not Accepted\n");
		fprintf(fptr1,"String Not Accepted\n");
	}
    }
    else
    {
	  fprintf(fptr,"\n=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=\n");
	  fprintf(fptr1,"\n=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=\n\n\n\n\n\n\n\n\n");
      return 0;
    }
  }
    
    fprintf(fptr,"\n=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=\n");
    fprintf(fptr1,"\n=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=\n");
  return 0;
}



