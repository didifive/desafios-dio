# Desafios e soluções da [dio.me](https://www.dio.me/)

## Aceleração Internacional para Profissionais de Tecnologia - Advanced Java Path

### Desafios teste de aprovação para participação no evento

Nesta pasta você encontrará desafios de teste de aprovação para participação na Aceleração Internacional para Profissionais de Tecnologia - Advanced Java Path da [dio.me](https://www.dio.me/).

Sugestão: evite copiar e colar, a ideia dos desafios é que você os enfrente, então se na dificuldade chegou até esse ponto, aproveite para ver como resolvi o desafio e como posso melhorar, a análise é mínima a ser feito.

Abaixo estão os links para os desafios:

<div align="left">
	<table border=1>
		<tr>
			<th colspan="4">Aceleração Internacional para Profissionais de Tecnologia - Advanced Java Path</th>
		</tr>
		<tr>
			<th>Etapa</th>
			<th>Desafio</th>
			<th>Solução</th>
			<th>Status</th>
		</tr>
		<tr>
			<td align="center">1</td>
			<td>Leap Year?</td>
			<td>
				<a href="https://github.com/didifive/desafios-dio/blob/master/desafios/Java/Acelera%C3%A7%C3%A3o%20Internacional%20Advanced%20Java%20Path/LeapYear.java">
					Código
				</a>
			</td>
			<td align="center">✅</td>
		</tr>
		<tr>
			<td align="center">2</td>
			<td>Difference Between Digits</td>
			<td>
				<a href="https://github.com/didifive/desafios-dio/blob/master/desafios/Java/Acelera%C3%A7%C3%A3o%20Internacional%20Advanced%20Java%20Path/DifferenceBetweenDigits.java">
					Código
				</a>
			</td>
			<td align="center">✅</td>
		</tr>
		<tr>
			<td align="center">3</td>
			<td>Exceeding V</td>
			<td>
				<a href="https://github.com/didifive/desafios-dio/blob/master/desafios/Java/Acelera%C3%A7%C3%A3o%20Internacional%20Advanced%20Java%20Path/ExceedingV.java">
					Código
				</a>
			</td>
			<td align="center">✅</td>
		</tr>
	</table>
</div>

### Challenge 1/3 - Leap Year?

**Challenge**
Make a program that asks for a number corresponding to a certain year and then informs if this year is a leap year or not

**Input**
The input consists of an integer value referring to the requested year.

**Output**
The output should return whether the year will be a leap year or not, as shown in the example below.

**Example**
| Input	| Output          |
|-------|-----------------|
| 1996  | “Leap year”     |
| 2001  | “Not leap year” |       


### Challenge 2/3 - Difference Between Digits

**Challenge**
The challenge consists of an integer n, where it will be necessary to calculate the difference between the product and the sum of its digits.

**Input**
- To find the product of the value, the digits must be multiplied.
- The sum, just add the digits.
- For the difference, it is necessary to subtract the final result from the two values.

**Output**
The output should return the final value of the difference between the product and the sum of the digits.

**Example**
| Input	| Output |
|-------|--------|
| 243   | 15     |
| 1521  | 1      |       


### Challenge 3/3 - Exceeding V

**Challenge**
As a good developer, you need to make a program that reads two integers: R and V (as many values for V as needed must be read, until a value greater than R is entered for it). Count how many integers must be added in sequence (considering the R in this sum) so that the sum exceeds V as little as possible. Write the final count value.  
The entry can contain, for example, the values 21 21 15 30. In this case, the value 21 is then assumed for R while the values 21 and 15 must be disregarded since they are less than or equal to R. As the value 30 is within the specification (greater than R) it will be valid and then the calculations must be processed to present the value 2 in the output, as it is the amount of values added to produce a value greater than 30 (21 + 22).

**Input**
The input contains only integer values, one per line, which can be positive or negative. The first input value will be the value of R. The next input line will contain V. If V does not meet the problem specification, it must be read again, as many times as necessary.

**Output**
Print a line with an integer that represents the amount of integers that must be added, according to the specification above.

**Example**
| Input	| Output |
|-------|--------|
| 3     | 5      |
| 1     |        |  
| 20    |        |  