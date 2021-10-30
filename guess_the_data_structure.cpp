// Name: Padmapani Patra
// e-mail: padmapanipatra@gmail.com

#include<bits/stdc++.h>
using namespace std;

int main() {
    int n;
    while(scanf("%d", &n)==1){
        stack<int> s;
        queue<int> q;
        priority_queue<int> pq;
        int command, element;
        bool isStack = true, isQueue = true, isPQueue = true;
        for(int i = 0; i < n; i++) {
            scanf("%d %d", &command, &element);
            switch(command) {
                case 1: 
                    if(isStack) s.push(element);
                    if(isQueue) q.push(element);
                    if(isPQueue) pq.push(element);
                    break;
                case 2: 
                    if(isStack) {
                        if(s.empty() || s.top() != element) isStack = false;
                        else s.pop();
                    }
                    if(isQueue) {
                        if(q.empty() || q.front() != element) isQueue = false;
                        else q.pop();
                    };
                    if(isPQueue) {
                        if(pq.empty() || pq.top() != element) isPQueue = false;
                        else pq.pop(); 
                    }
                    break;
            }
        }
        if(isStack && !isQueue && !isPQueue) {
            cout<<"Stack"<<endl;
        } else if(!isStack && isQueue && !isPQueue) {
            cout<<"Queue"<<endl;
        } else if(!isStack && !isQueue && isPQueue) {
            cout<<"Priority queue"<<endl;
        } else if(!isStack && !isQueue && !isPQueue) {
            cout<<"Impossible"<<endl;
        } else {
            cout<<"Not Sure"<<endl;
        }
    }
    return 0;
}