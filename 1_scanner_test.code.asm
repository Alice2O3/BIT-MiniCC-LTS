.386
.model flat, stdcall
option casemap:none

includelib msvcrt.lib
includelib user32.lib
includelib kernel32.lib

printf PROTO C : ptr sbyte, :VARARG
scanf PROTO C : ptr sbyte, :VARARG

.data
forIntNumber	db '%d',0
forString	db '%s',0
forEnter	db ' ',0
IntNumberHolder dd 0

.code
__init:
	call main
	ret
Mars_PrintInt:
	mov esi, [esp+4]
	pushad
	invoke printf, offset forIntNumber, esi
	invoke printf, offset forEnter
	popad
	ret
Mars_GetInt:
	pushad
	invoke scanf, offset forIntNumber, offset IntNumberHolder
	popad
	lea eax, IntNumberHolder
	mov eax, [eax]
	ret
Mars_PrintStr:
	mov esi, [esp+4]
	pushad
	invoke printf, offset forString, esi
	popad
	ret
main:
	push ebp
	mov ebp, esp
	sub esp, 16
	mov edx, 0
	mov ecx, edx
	mov edx, 1
	mov ebx, edx
	mov esi, ebx
	add esi, ecx
	mov edx, esi
	mov ecx, edx
	mov ebx, ecx
	push ebx
	call Mars_PrintInt
	mov edi, eax
	sub esp, 4
	mov ebx, 0
	mov eax, ebx
	mov esp, ebp
	pop ebp
	ret
end __init
