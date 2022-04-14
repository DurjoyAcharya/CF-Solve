#pragma gcc
#include<bits/stdc++.h>
using namespace std;
class Base
{
public:
    void fun_1()
    {
     cout<<"BASE-1\n";
    }
    virtual void fun_2()
    {
        cout<<"BASE-2\n";
    }
    virtual void fun_3()
    {
        cout<<"BASE-3\n";
    }
     virtual void fun_4()
    {
        cout<<"BASE-4\n";
    }
};
class Derived:public Base
{
public:
    void fun_1()
    {
     cout<<"DERIVED-1\n";
    }
    void fun_2()
    {
     cout<<"DERIVED-2\n";
    }
    void fun_4(int num)
    {
        cout<<"DERIVED-"<<num<<"\n";
    }
};
int32_t main(int argc,char** argv)
{
    Base* bptr;
    Derived D;
    bptr=&D;
    bptr->fun_1();
    bptr->fun_2();
    int a=5;
    bptr->fun_4();
}
