#include <iostream>
#include <iomanip>

using namespace std;

int main(){
	
	int nFuncionario, nHoras; 
	double salarioHora, salario;
	
    cin >> nFuncionario;
    cin >> nHoras;
    cin >> salarioHora;
    
    salario = nHoras*salarioHora;
    
    cout << "NUMBER = " << nFuncionario << endl;
    cout << "SALARY = U$ " << fixed << setprecision(2) << salario << endl;
    
    system("pause");
    
    return 0;
}
