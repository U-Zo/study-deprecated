const someValue: any = 'this is a string';
const strLength: number = (<string>someValue).length;
console.log(strLength);

const strLength2: number = (someValue as string).length;
console.log(strLength2);

const str = '1';
let str2: number = <number>(<any>str);
let str3: string = <string>(<any>str2);
let str4: string = (str as any) as string;
console.log(str, str2, str3);
