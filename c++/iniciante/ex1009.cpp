#include <iostream>
#include <iomanip>

using namespace std;

int main(){
	
	string nome;
	double salarioFixo, vendasMes, total;
	
    cin >> nome;
    cin >> salarioFixo;
    cin >> vendasMes;
    
    total = salarioFixo + (vendasMes*0.15);
    
    cout << "TOTAL = R$ " << fixed << setprecision(2) << total << endl;
    
    system("pause");
    
    return 0;
}
