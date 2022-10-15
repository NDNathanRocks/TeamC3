

all: test

test: test.c
	g++ -o test test.cpp

clean: 
	rm -f test