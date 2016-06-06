				.MODEL medium
				.STACK
				.DATA
				.CODE
				.STARTUP
				mov ah,02 		;Print S
				mov dl,'S'
				int 021h
				mov bx, 65000 	;4
back2: 			mov cx, 64000 	;4
back1: 			nop 			;3
				loop back1 		;17^or5v
				dec bx 			;2
				jnz back2 		;16^or4v

				mov ah,02 		;Print F
				mov dl,'F'
				int 021h
				.EXIT
				END