#include <iostream>
#include <iomanip>

using namespace std;

int main(){
	
	int codPeca[2], numPeca[2];
	double vUniPeca[2], valorTotal = 0;
	float pecas[2][3];
	
    for(int i = 0; i < 2; i++){
    	cin >> codPeca[i];
    	cin >> numPeca[i];
    	cin >> vUniPeca[i];
    	for(int j = 0; j < 3; j++){
    		switch (j){
    			case 0:
    				pecas[i][j] = codPeca[i];
    			break;
    			
    			case 1:
    				pecas[i][j] = numPeca[i];
    			break;
    			
    			case 2:
    				pecas[i][j] = vUniPeca[i];
    			break;
			}
		}
	}
	
	for(int i = 0; i < 2; i++){
		valorTotal += pecas[i][1] * pecas[i][2];
	}
    
    cout << "VALOR A PAGAR: R$ " << fixed << setprecision(2) << valorTotal << endl;
    
    system("pause");
    
    return 0;
}
